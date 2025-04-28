class Admin
{ private Course courses[];
  private Enquiry enquiries[];
  private Course course=null;
  private Batch batch;
  public void setCourses(Course courses[])
  { this.courses=courses;
  }
  public Course [] getCourses()
   { return courses;
   }
  public void setEnquiries(Enquiry enquiries[])
   { this.enquiries=enquiries;
   }
   public Enquiry[] getEnquiries(){
	return enquiries;
   }
   public Course getCourseByName(String courseName)
   {  
         for(Course c:courses)
	 { String acourseName=c.getName();
	   if(acourseName.equals(courseName))
	    { course=c;
	      break;
	    }
	 }
	return course;
    }
   public boolean askForAdmission(int eid,String ename,String feedback)
   {   boolean b=false;
	if(feedback.equals("yes"))
	{
	   for(Enquiry e:enquiries)
	   {
		if(e.getId()==eid && e.getName().equals(ename))
		{  e.setStatus(true);
		   b=true;
		  break;
		}
	   }
	}
	return b;
   }
   public void setBatch(Batch batch)
   {  this.batch=batch;
   }
   public Batch getBatch()
   { 
	 return batch;  
   }
}
