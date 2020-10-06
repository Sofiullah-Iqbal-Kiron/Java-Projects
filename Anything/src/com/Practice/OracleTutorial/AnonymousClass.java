// Anonymous Class practice.


package com.Practice.OracleTutorial;

public class AnonymousClass
{
    interface HelloWorld
    {
        public void greet();

        public void greetSomeone(String someone);
    }

    public void sayHello()
    {
        class EnglishGreeting implements HelloWorld
        {
            String name = "World";
            public void greet()
            {
                greetSomeone("World");
            }

            public void greetSomeone(String someone)
            {
                System.out.println("Hello" + someone);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld()
        {
            @Override
            public void greet()
            {
                greetSomeone("tout le monde");
            }
            @Override
            public void greetSomeone(String someone)
            {
                System.out.println("Salut " + someone);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld()
        {
            @Override
            public void greet()
            {
                greetSomeone("mundo");
            }
            @Override
            public void greetSomeone(String someone)
            {
                System.out.println("Hola " + someone);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String[] args)
    {
        AnonymousClass myApp = new AnonymousClass();
        myApp.sayHello();
    }
}
