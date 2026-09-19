class MyMammals {
      void mam(){
         System.out.println("Inside MyMammals class");
      }
}
 class Lion extends MyMammals{
    void roar(){
        System.out.println("Inside Lion class");
    }
 }
 class Human extends MyMammals{
     void hum(){
         System.out.println("Inside Human");
     }
 }
 class MyMammals{
      public static void main(String args[]){
      Lion obj=new Lion();
      obj.hum();
      obj.roar();
      obj.mam();
      }
 }