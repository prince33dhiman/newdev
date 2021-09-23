package cl;

public class Sum {
    String name;
    int age;

   public Sum( String name , int age){
       this.name= name;
       this.age = age;
       System.out.println(name + age);
    }
    }


    public static void main(String[] args) {
        Sum sm = new Sum("prince", 10);
    }
}
}

