
public enum Months {
    ENERO (1), FEBRERO (2),MARZO (3), ABRIL (4), MAYO (5), JUNIO (6),
    JULIO (7), AGOSTO (8), SEPTEMBRE (9), OCTUBRE (10), NOVIEMBRE (11),
    DICIEMBRE(12) ;
    
    private int num;
    private Months(int num){
        this.num = num;
    }
    public int getNE(){
        return this.num;
    }
}
