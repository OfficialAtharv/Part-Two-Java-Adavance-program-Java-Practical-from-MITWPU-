
class voter {

    public String Votername;
    public String Voteradress;
    public String Votercontact;
    public String Voteradhaar;

    public voter(String Votername,String Voteradress,String Votercontact,String Voteradhaar){
        this.Votername=Votername;
        this.Voteradress=Voteradress;
        this.Votercontact=Votercontact;
        this.Voteradhaar=Voteradhaar;
    }
    public void display() {
        System.out.println("Voter name : " + Votername + " , voter adress:" + Voteradress + " ,voter Contact:" + Votercontact + " ,Voter adhaar:" + Voteradhaar);
    }
}

class Q25 {

    public static void main(String args[]) {
        voter[] obj = new voter[9];
        obj[0] = new voter("Atharv", "Pune", "7066150996", "789456123");
        System.out.println("Voter 1:-");
        obj[0].display();
        obj[1] = new voter("Pranav", "Miraj", "1234567890", "123745602");
        System.out.println("Voter 2:-");
        obj[1].display();


        obj[2] = new voter("Sumit", "Nashik", "1010101010", "964123652");
        System.out.println("Voter 3:-");
        obj[2].display();


        obj[3] = new voter("Chintamani", "Jaisingpur", "303556282", "7628220665");
        System.out.println("Voter 4:-");
        obj[3].display();


        obj[4] = new voter("Saurabh", "Nagar", "4141486566", "25474695");
        System.out.println("Voter 5:-");
        obj[4].display();


        obj[5] = new voter("Abhijeet", "Kolhapur", "741474110", "159753123");
        System.out.println("Voter 6:-");
        obj[5].display();


        obj[6] = new voter("Rushikesh", "Miraj", "142365478", "321123211");
        System.out.println("Voter 7:-");
        obj[6].display();


        obj[7] = new voter("Aditya", "Pune", "741474635", "964123652");
        System.out.println("Voter 8:-");
        obj[7].display();


        obj[8] = new voter("Varad", "Miraj", "7415965832", "7845612386");
        System.out.println("Voter 9:-");
        obj[8].display();

        
        obj[9] = new voter("Awej", "Sangli", "456456123", "7418529630");
        System.out.println("Voter 10:-");
        obj[9].display();
    }
}
