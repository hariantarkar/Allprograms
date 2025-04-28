import java.util.*;
public class InsMangApplication
{
    public static void main(String x[])
    {  Admin admin = new Admin();
	Course c[]=new Course[2];
	Enquiry e[]=new Enquiry[3];
          Batch newBatch = new Batch();//batch created 
	Scanner xyz  = new Scanner(System.in);
	do{
	  System.out.println("1:Create Courses");
	  System.out.println("2:View All Courses");
	  System.out.println("3:Add New Enquiries");
	  System.out.println("4:View All Enquiries");
	  System.out.println("5:Ask for admission");
          System.out.println("6:View All Admission");
	  System.out.println("7:Create Batch And allocate course and students for batch");
	  System.out.println("8:View Batch Admission");
	  System.out.println("Enter your choice");
	  int choice=xyz.nextInt();
	  switch(choice)
	  {
	      case 1:
	     xyz.nextLine();
	      for(int i=0;i<c.length;i++)
	      { c[i]=new Course();//array of object
	       System.out.println("Enter name id and fees and duration");
		String name=xyz.nextLine();
	        int id=xyz.nextInt();
                int fees=xyz.nextInt();
                int duration=xyz.nextInt();
                 c[i].setName(name);
                 c[i].setId(id);
                 c[i].setFees(fees);
                 c[i].setDuration(duration);
		 xyz.nextLine();
	      }
	      admin.setCourses(c); //set courses by admin 
	      break;	
	      case 2:
	 if(c[0]!=null){
	System.out.println("===============================================================");
	System.out.println("Course Id\tCourse Name\tCourse Fees\tCourse Duration");
		for(int i=0;i<c.length;i++)
		{
       System.out.println(c[i].getId()+"\t\t"+c[i].getName()+"\t\t"+c[i].getFees()+"\t\t"+c[i].getDuration());
		}
        System.out.println("===============================================================");
	 }
	 else{
 	  System.out.println("There is no any course present");
	 }
	  break;
		case 3:
	System.out.println("===============================================================");
		xyz.nextLine();
	     for(int i=0;i<e.length;i++)
	     { System.out.println("Enter name id contact and address");
	       e[i]=new Enquiry();
	       e[i].setName(xyz.nextLine());
	       e[i].setId(xyz.nextInt());
		 xyz.nextLine();
               e[i].setContact(xyz.nextLine());
	       e[i].setAddress(xyz.nextLine());
	       e[i].setStatus(false);
	       System.out.println("Enter course name");
	       String courseName=xyz.nextLine();
	       Course course=admin.getCourseByName(courseName);
		 e[i].setCourse(course);
             }
	    admin.setEnquiries(e);
		break;
	     case 4:
	 if(e[0]!=null)
         {
	  System.out.println("===============================================================");
	System.out.println("Eqnqiry Id\tEnquiry Name\tContact\t\tAddress\t\tStatus");
		for(int i=0;i<e.length;i++)
		{  Course course=e[i].getCourse();
       System.out.println(e[i].getId()+"\t\t"+e[i].getName()+"\t\t"+e[i].getContact()+"\t\t"+e[i].getAddress()+"\t\t"+e[i].isStatus()+"\t\t"+course.getName());
		}
        System.out.println("===============================================================");
	     break;
        }
      else{
	 System.out.println("There is no any enquiry");
      }
	break;
	case 5:
	xyz.nextLine();
	System.out.println("Call For confirmation");
	String ename=xyz.nextLine();
	int eid=xyz.nextInt();
	 xyz.nextLine();
	String feedback=xyz.nextLine();
	boolean b=admin.askForAdmission(eid,ename,feedback);
	if(b)
	 { System.out.println("Yes Admission done success");
	 }
	else{
	  System.out.println("No Cancel admission");
	}
	break;
	case 6:
	 if(e[0]!=null)
         {
	  System.out.println("===============================================================");
	System.out.println("Admission Id\tAdmission Name\tContact\t\tAddress\t\tStatus");
		for(int i=0;i<e.length;i++)
		{  Course course=e[i].getCourse();
	    if(e[i].isStatus())
            { 
       System.out.println(e[i].getId()+"\t\t"+e[i].getName()+"\t\t"+e[i].getContact()+"\t\t"+e[i].getAddress()+"\t\t"+e[i].isStatus()+"\t\t"+course.getName());
	    }
		}
        System.out.println("===============================================================");
	     break;
        }
      else{
	 System.out.println("There is no any enquiry");
      }
       break;
        case 7:
        System.out.println("Enter batch code");
        int batchid=xyz.nextInt();
 	xyz.nextLine();
        System.out.println("Enter batch label");
        String batchName=xyz.nextLine();
        System.out.println("Enter batch start date");
        String batchStartDate=xyz.nextLine();
        System.out.println("Enter batch start time");
        String batchStartTime=xyz.nextLine();
        Course bc= new Course();
        System.out.println("Enter course detail for batch");
         int cid=xyz.nextInt();
           xyz.nextLine();
         String courseName=xyz.nextLine();
          bc.setId(cid);
          bc.setName(courseName);

          newBatch.setId(batchid);
          newBatch.setName(batchName);
          newBatch.setStartDate(batchStartDate);
          newBatch.startTime(batchStartTime);
          newBatch.setCourse(bc);
        //logic for allocate admission to batch
        Enquiry e1[]=new Enquiry[5];
	 int index=0;
        for(int i=0;i<e.length;i++)
        {
               if(e[i].isStatus()==true)
                {  Course ec=e[i].getCourse();
	 	  boolean result=newBatch.isCourseMatch(ec);
		   if(result)
		   {
			e1[index]=e[i];
		        index++;
		   }
                }
        }
	newBatch.setAdmission(e1);
	 break;
       case 8:
	System.out.println("===============================================================================\n");
	int bid=newBatch.getId();
        String bname=newBatch.getName();
	String sdate=newBatch.getStartDate();
	String stime=newBatch.getStartTime();
        Course bcourse=newBatch.getCourse();
	Enquiry badms[]=newBatch.getAdmissions();
	System.out.println(bid+"\t"+bname+"\t"+sdate+"\t"+stime+"\t"+bcourse.getId()+"\t"+bcourse.getName());
	System.out.println("===================================================================================");
	for(int i=0;i<badms.length;i++)
	{
	    if(badms[i]!=null)
	    {
	   System.out.println(badms[i].getId()+"\t"+badms[i].getName()+"\t"+badms[i].getContact()+"\t"+badms[i].getAddress()+"\t"+badms[i].isStatus());
	    }
	}
	
	
	      case 11:
	       System.exit(0);
	       break;
	      default:
	       System.out.println("Wrong choice");
          }
	}while(true);

    }
}



