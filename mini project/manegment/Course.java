class Course
{
   private int id;
   private String name;
   private int fees;
   private int duration;

   public void setId(int id)
   { this.id=id;
   }
   public int getId(){
     return id;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName(){
     return name;
   }
   public void setFees(int fees)
    { this.fees=fees;
   }
   public int getFees(){
	return fees;
   }
   public void setDuration(int duration)
   { this.duration=duration;
   }
   public int getDuration(){
     return duration;
    }
}
