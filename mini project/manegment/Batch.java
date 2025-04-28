class Batch
{
  private int id;
  private String batchName;
  private String startDate;
  private String startTime; //10:00AM
  private Course course;
  private Enquiry enquiries[];
  public void setId(int id)
   { this.id=id;
   }
  public int getId(){
    return id;
  }
  public void setName(String name)
   { this.batchName=name;
   }
  public String getName(){
     return batchName;
   }
   public void setStartDate(String startDate)
   { this.startDate=startDate;
   }
   public String getStartDate(){
    return startDate;
   }
   public void startTime(String startTime)
   { this.startTime=startTime;
   }
   public String getStartTime()
   { return startTime;
   }
   public void setCourse(Course course)
   { this.course=course;
   }
   public Course getCourse(){
     return course;
  }
   public boolean isCourseMatch(Course enCourse)
   {
       return course.getId()==enCourse.getId()?true:false;
   }
   public void setAdmission(Enquiry enquiries[])
   {
        this.enquiries=enquiries;
   }
   public Enquiry[] getAdmissions()
   {  return enquiries;
   }
}

