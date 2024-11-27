// day22
// Defanging an IP Address
class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}

// Day of the Year
class Solution {
    public int dayOfYear(String date) {
        int[]daysInMonths={31,28,31,30,31,30,31,31,30,31,30,31};
        String[]parts=date.split("-");

        int year=Integer.parseInt(parts[0]);
        int month=Integer.parseInt(parts[1]);
        int day=Integer.parseInt(parts[2]);
        
        if(isLeapYear(year))daysInMonths[1]=29;
        
        int dayOfYear=0;
        
        for(int i=0;i<month-1;i++)
        {
            dayOfYear+=daysInMonths[i];
        }
        
        dayOfYear+=day;
        
        return dayOfYear;
    }
    static boolean isLeapYear(int year)
    {
        return ((year%4==0 && year%100!=0) || year%400==0);
    }
}