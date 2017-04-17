package game.play;


import java.lang.Thread;
import java.lang.Runnable;

public class List implements Runnable{
	PrimeGen pg;
	Primes primes;
	int numPrimes=0;
	int numProgress=0;
	String text="";
	boolean stop=false;
	long prevTime=System.currentTimeMillis();
	
	public List(PrimeGen pg){
		this.pg=pg;
		primes=pg.primes;
	}
	
	public void run(){
		//getting ready for listing
		int num=Integer.parseInt(pg.input.getText());
		numPrimes=0;
		if(primes.getLength()<num){
			primes=new Primes(num,primes);
		}
		primes.reset();
		pg.progress.setMaximum(num);
		pg.progress.setValue(0);
		pg.progress.setString("Processing");
		
		//begin listing
			//does first step
		int prime=primes.nextPrime();
		text=""+prime;
		numPrimes++;
		prime=primes.nextPrime();
			//loop through rest of steps
		while(prime<=num && prime!=-1 && !stop){
			text=text+", "+prime;
			numPrimes++;
			numProgress=prime;
			prime=primes.nextPrime();
			long currentTime=System.currentTimeMillis();
			if((currentTime-prevTime)>100){
				updatePG();
				prevTime=currentTime;
			}
		}
		//print info in pg
		updatePG();
		//update variables in pg
		pg.numPrimes=numPrimes;
		pg.numProgress=numProgress;
		pg.primes=primes;
		pg.text=text;
		if(stop){
			pg.progress.setString("Process Aborted");
			pg.print("\n\nPROCESS ABORTED");
		}else{
			pg.progress.setString("Finished");
			pg.progress.setValue(
				pg.progress.getMaximum()
			);
		}
		//update other stuff
		pg.list.setText("List");
		pg.process=0;
		pg.printEnd();
	}
	
	public void updatePG(){
		pg.progress.setValue(numProgress);
		pg.primesFound.setText(""+numPrimes);
		int percent=(int)(pg.progress.getPercentComplete()*100);
		pg.progress.setString("Processing ("+percent+"%)");
		pg.print(text);
		text="";
		stop=pg.stop;
	}
}