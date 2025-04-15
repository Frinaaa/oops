import java.util.Scanner;

class Books
{
	String publisher;
	String title;
	String author;
	int price;
	
	void display()
	{
		System.out.println("Publisher :"+publisher);
		System.out.println("Title :"+title);
		System.out.println("Author :"+author);
		System.out.println("Price :"+price);
	}
}

class Literature extends Books
{
	String genre;
	
	void display()
	{
		super.display();
		System.out.println("Genre :"+genre);
	}
}

class Fiction extends Books
{
	String genre;
	
	void display()
	{
		super.display();
		System.out.println("Genre :"+genre);
	}
}

public class Book
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		String publisher,title,author,genre;
		int price;
		
		do{
		  System.out.println("Enter \n 1.Literature \n 2.Fiction \n 3.Exit :");
		  choice=sc.nextInt();
		  if(choice==3) {
		  	System.out.println("Exiting.....");
		  	System.exit(0);
		  }
		  System.out.print("Enter publisher :");
		  publisher=sc.next();
		  System.out.print("Enter title :");
		  title=sc.next();
		  System.out.print("Enter author :");
		  author=sc.next();
		  System.out.print("Enter genre :");
		  genre=sc.next();
		  System.out.print("Enter price :");
		  price=sc.nextInt();
		  
		  if(choice==1)
		  {
		  	Literature lit=new Literature();
		  	lit.publisher=publisher;
		  	lit.title=title;
		  	lit.author=author;
		  	lit.genre=genre;
		  	lit.price=price;
		  	System.out.println("\n*** Literature Book Details ***");
		  	lit.display();
		  }
		  else if(choice==2)
		  {	
		  	Fiction fic=new Fiction();
		  	fic.publisher=publisher;
		  	fic.title=title;
		  	fic.author=author;
		  	fic.genre=genre;
		  	fic.price=price;
		  	System.out.println("\n*** Fiction Details ***");
		  	fic.display();
		  }
		  } while(true);
	}
}

