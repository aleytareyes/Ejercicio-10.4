
public class LeadYear extends Year{
    public LeadYear(){
        this.cD = 366;
    }
    public int daysE(Months mes, int day){
        switch(mes.getNE()){
            case 2:
            day += 31;
            break;
            case 3:
            day += 60;
            break;
            case 4:
            day += 91;
            break;
            case 5:
            day += 31;
            break;
            case 6:
            day += 152;
            break;
            case 7:
            day += 182;
            break;
            case 8:
            day += 213;
            break;
            case 9:
            day += 244;
            break;
            case 10:
            day += 274;
            break;
            case 11:
            day += 305;
            break;
            case 12:
            day += 335;
            break;
        }
        return day;
    }
}
