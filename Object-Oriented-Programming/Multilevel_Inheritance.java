class Animals{  
    void eat(){
        System.out.println("eating");
    }  
}  

class Dog extends Animals{  
    void bark(){
        System.out.println("barking");
    }  
} 

class Baby_dog extends Dog{  
    void weep(){
        System.out.println("weeping");
    }  
}  

class Multilevel_Inheritance{  

    public static void main(String args[]){  
        Baby_dog baby_dog=new Baby_dog(); 

        baby_dog.weep();  
        baby_dog.bark();  
        baby_dog.eat();
    }
}  
