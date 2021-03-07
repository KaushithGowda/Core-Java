package com.abc.deserializationExternalisable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Cricketer implements Externalizable {


		String name;
		int runs;
		float avg;
		float strikeRate;

		/**
		 * @param name
		 * @param runs
		 * @param avg
		 * @param strikerate
		 */
		public Cricketer(String name, int runs, float avg, float strikeRate) {
			super();
			this.name = name;
			this.runs = runs;
			this.avg = avg;
			this.strikeRate = strikeRate;
		}
		
		public Cricketer() {
			
		}
		
		public void disp()
		{
			System.out.println(name);
			System.out.println(runs);
			System.out.println(avg);
			System.out.println(strikeRate);
		}

		//in externalizable class two abstract methos are present so we have to compulsorily implement them
		@Override
		public void writeExternal(ObjectOutput out) throws IOException {
			out.writeInt(runs);			
		}

		@Override
		public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
			runs=in.readInt();
		}
	
		

}
