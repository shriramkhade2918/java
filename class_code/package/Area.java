package mathform;

public class Area{
        int num1=0;
        int num2=0;
  
        public Area(int num1){
                this.num1=num1;
                //this.num2=num2;
        }
        public int sqr(){
                return num1*num1;
        }
        public Area(int num1,int num2){
                this.num1=num1;
                this.num2=num2;
        }
        public int rect(){
                return num1*num2;
        
        }

}
