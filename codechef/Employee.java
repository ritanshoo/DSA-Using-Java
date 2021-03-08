package codechef;

//public class Employee {
//
//}

public class Employee {

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        int i,f=0,pos = -1,da=0,salary;

        char empDes;

        String empid[]={"1001","1002","1003","1004","1005","1006","1007"};

        String depName[]={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};

        String empName[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};

        String dateJoin[]={"1/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/01/2000","12//06/2006"};

        int basic[]={20000,30000,10000,12000,50000,23000,29000};

        int hra[]={8000,12000,8000,6000,20000,9000,12000};

        int it[]={3000,9000,1000,2000,20000,4400,10000};

        String desg = null;

        char DesCodes[]={'e','c','k','r','m','e','c'};

        for(i=0;i<(empid.length);i++)

        {

            if(args[0].equals(empid[i]))

            {

                pos=i;

                //f=1;

            }



        }

        if(pos==-1)

        {

            System.out.println("Emp id does not exist");

            return;

        }



        //System.out.println("Hello");

        empDes=DesCodes[pos];

        switch(empDes)

        {

            case 'e':

                desg="Engineer";

                da=20000;

                break;

            case 'c':

                desg="Consultants";

                da=32000;

                break;

            case 'k':

                desg="Clerk";

                da=12000;

                break;

            case 'r':

                desg="Receptionist";

                da=15000;

                break;

            case 'm':

                desg="Manager";

                da=40000;

                break;

        }

        salary=basic[pos]+hra[pos]+it[pos]+da;

        //System.out.println(salary);

        System.out.println("Emp no\t\tEmployee Name\t\tDeaprtment\t\tDesignation\t\tSalary");

        System.out.println(empid[pos]+"\t\t\t"+empName[pos]+"\t\t\t"+depName[pos]+"\t\t\t"+desg+"\t\t"+salary);

    }

}