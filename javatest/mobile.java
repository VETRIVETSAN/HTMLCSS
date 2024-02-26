class Mobile
{
	//states
	String name,ram,storage,color;
	double price;
	//lazy Ins
	Sim slot1,slot2;

	//beviour
	public void insertSim1(Sim slot1){

		if (this.slot1==null)
		{
			//it means sim 1traybis empty lets and the sim
			this.slot1=slot1;//sim added into tray1(slot1)
			System.out.println(slot1.sname+ ":addes succesfully");
		}
		else
		{
			//it means sim tray is not empty
			System.out.println("already"+slot1.sname+ "is present can't add again");
		}
	}

	public void insertSim2(Sim slot2){
		if (this.slot2==null)
		{
			//it means sim 2 tray is empty lets and the sim
			this.slot2=slot2;//sim added into tray2(slot2)
			System.out.println(slot2.sname+ ":addes succesfully");
		}
		else
		{
			//it means sim tray is not empty
			System.out.println("already"+slot2.sname+ "is present can't add again");
		}
	}

	//removeing sim1
	public void removesim1(){
		//checking is sim1 tray is empty we cant remove sim
		if (this.slot1==null)
		{
			//alreaday sim is removed
			System.out.println("already sim is removed");
		}
		else
		{
			//sim is precent to remove lets'remove the sim
			System.out.println(slot1.sname+ "is removed succesfully");
			this.slot1=null;//sim1 removed
		}
	}

	//removeing sim2
	public void removesim2(){
		//checking is sim2 tray is empty we cant remove sim
		if (this.slot2==null)
		{
			//alreaday sim is removed
			System.out.println("already sim is removed");
		}
		else
		{
			//sim is precent to remove lets'remove the sim
			System.out.println(slot2.sname+ "is removed succesfully");
			this.slot2=null;//sim2 removed
		}
	}

	//Is sim 1 present

	public boolean isSim1present(){
		if (this.slot1==null)
		{
			//that means sim1 not present so tell user false
			return false;
		}
		//control is following till here means sim is preecent so tell user true
		return true;
	}

	//Is sim 2 present

	public boolean isSim2present(){
		if (this.slot2==null)
		{
			//that means sim2 not present so tell user false
			return false;
		}
		//control is following till here means sim is preecent so tell user true
		return true;
	}
	//details of mobile
	public void detailsOfmobile(){

		System.out.println("mobile name:"+name);
		System.out.println("mobile price:"+price);
		System.out.println("mobile ram:"+ram);
		System.out.println("mobile color:"+color);
		System.out.println("mobile storage:"+storage);
		System.out.println(" ***********************");
	}


	



}
