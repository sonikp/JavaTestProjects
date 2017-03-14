package youtube.swingtutorial;

/**
 * part of PrimeGen.java
 */

import java.lang.Math;

public class Primes{
	private int current=1;
	private int highest=2;
	private boolean primes[];
	private int length;
	
	/*public static void main(String args[]){
		Primes p=new Primes(500);
		int prime=0;
		while(prime!=-1){
			prime=p.nextPrime();
			System.out.println(prime);
		}
		System.out.println("\nIncreasing range\n");
		Primes p2=new Primes(1000,p);
		prime=0;
		while(prime!=-1){
			prime=p2.nextPrime();
			System.out.println(prime);
		}
	}*/
	
	//constructors
	public Primes(){
		length=1000;
		primes=new boolean[length+1];
		primes[0]=false;
		primes[1]=false;
		for(int i=2;i<primes.length;i++){
			primes[i]=true;
		}
	}
	
	public Primes(int length){
		this.length=length;
		primes=new boolean[length+1];
		primes[0]=false;
		primes[1]=false;
		for(int i=2;i<primes.length;i++){
			primes[i]=true;
		}
	}
	
	public Primes(int length,Primes p){
		//sets up length and primes variables
		this.length=length;
		highest=p.getHighest();
		primes=new boolean[length+1];
		//copies values from p over to primes
		primes[0]=false;
		primes[1]=false;
		int i=2;
		int length_old=p.getLength();
		boolean[] primes_old=p.getPrimes();
		while(i<=length_old){
			primes[i]=primes_old[i];
			i++;
		}
		//sets up the rest of the array as true
		while(i<primes.length){
			primes[i]=true;
			i++;
		}
		//adujusts the points not covered in p based on its primes
		for(i=2;i<=p.getHighest();i++){
			if(primes[i]){
				int j=i*(int)Math.ceil((length_old+1)/i);
				while(j<=length){
					primes[j]=false;
					j+=i;
				}
			}
		}
	}
	
	//resets current to 2
	public void reset(){
		current=1;
	}
	
	public boolean test(int value){
		boolean ans=false;
		if(value>length){
			ans=false;
		}else if(value<highest){
			ans=primes[value];
		}else{
			int c=current;
			int prime=0;
			while(prime<=value && prime!=-1){
				prime=nextPrime();
			}
			current=c;
			ans=primes[value];
		}
		return ans;
	}
	
	public int nextPrime(){
		int ans=0;
		while(ans==0){
			current++;
			if(current>length){
				ans=-1;
			}else if(current<highest){
				if(primes[current]){
					ans=current;
				}
			}else{
				if(primes[current]){
					ans=current;
					for(int i=(2*current);i<primes.length;i+=current){
						primes[i]=false;
					}
				}
				highest=current;
			}
		}
		return ans;
	}
	
	public boolean[] getPrimes(){
		return primes;
	}
	
	public int getLength(){
		return length;
	}
	
	public int getHighest(){
		return highest;
	}
}