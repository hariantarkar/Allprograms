class Enquiry
{ private int id;
  private String name;
  private String contact;
  private String address;
  private Course course;
  private boolean status;
  
   public void setStatus(boolean status)
   { this.status=status;
   }
   public boolean isStatus(){
     return status;
   }
   public void setId(int id){
    this.id=id;
   }
   public int getId(){
     return id;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName()
   { return name;
   }
   public void setContact(String contact)
   { this.contact=contact;
   }
   public String getContact()
   { return contact;
   }
   public void setAddress(String address)
   { this.address=address;
   }
    public String getAddress()
   { return address;
   }
   public void setCourse(Course course)
   { this.course=course;
   }
   public Course getCourse()
   { return course;
   }
}
