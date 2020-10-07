# Scanner and Date Exercise

### by Janine Parham 

``` java
    Scanner scan = new Scanner(System.in);
    System.out.println("Please write your name: ");
    String name = scan.nextLine();

    System.out.println("Please write your email address: ");
    String email = scan.nextLine();

    LocalDate today = LocalDate.now();

    System.out.println("Name: " + name);
    System.out.println("Email " + email);
    System.out.println("Date: "+ today);
    
    scan.close();
```
