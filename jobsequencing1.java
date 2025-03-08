import java.util.*;
class job
{
    int id;
    int deadline;
    int profit;
    job(int id,int deadline,int profit)
    {
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }
    }
    public class jobscheduling
    {
        public static void schedulejobs(job[] jobs )
        {
            Arrays.sort(jobs,(a,b)->b.profit-a.profit);
            int n=jobs.length();
            boolean[] slots=new boolean[n];
            int[] result[]=new int[n];
            int totalprofit=0;
            for(job job:jobs)
            {
                for(int j=jobs.deadline-1;j>=0;j--)
                {
                    if(!slots[j])
                    {
                        slots[j]=true;
                        result[j]=job.id;
                        totalprofit+=job.profit;
                        break;
                    }
                }
            }
            System.out.println("Selected jobs:");
            for(int job:result)
            {
                if(job!=0)
                {
                    System.out.println(job+"");
                }
            }
            System.out.println("Total profit: "+totalprofit);
        }
        public static void main(String[] args)
        {
            job[] jobs={
                new job(1,2,100),
                new job(2,1,19),
                new job(3,2,27),
                new job(4,1,25),
                new job(5,3,15)
            };
            schedulejobs(jobs);
        }
    }