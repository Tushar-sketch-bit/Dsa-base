public class question {
    class Obj{
        public int num1;
        public int num2;
        public int num3;
        Obj(int num1,int num2,int num3){
            this.num1=num1;
            this.num2=num2;
            this.num3=num3;
        }
    }

    public void addValue(){
        Obj one=new Obj(1, 2, 3);
        int added_val=one.num1+one.num2+one.num3;
        System.out.println(added_val); 
    }

    public static void main(String[] args) {
        question q=new question();
        q.addValue();
        

    }
}
