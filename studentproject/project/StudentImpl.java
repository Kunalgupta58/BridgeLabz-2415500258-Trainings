package studentproject.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentImpl implements IStudent {
    private Connection con;
    
    private Scanner sc=new Scanner(System.in);
    
    public StudentImpl() {
        IConnection ic = new ConnectionImpl();
        con = ic.getConnection();
    }
    
	@Override
	public void insertStudent() {
		try {
			System.out.println("Enter ID: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Course: ");
            String course = sc.nextLine();
            String query="INSERT INTO student VALUES(?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query) ;
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, course);
            ps.executeUpdate();
            System.out.println("Insert the data sucesfully");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void insertMultipleStudents() {
		System.out.println("Enter number of Students to insert: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("\n Inserting Student "+(i+1));
		    insertStudent();
		}
		
	}

	@Override
	public void updateStudent() {
		try {
            System.out.print("Enter ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new Name: ");
            String name = sc.nextLine();
            System.out.print("Enter new Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new Course: ");
            String course = sc.nextLine();

            PreparedStatement ps = con.prepareStatement("UPDATE student SET name=?, age=?, course=? WHERE id=?");
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, course);
            ps.setInt(4, id);
            int rows = ps.executeUpdate();

            if (rows > 0) System.out.println("Student updated successfully!");
            else System.out.println("Student not found!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void updateMultipleStudents() {
		System.out.print("Enter number of students to update: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nUpdating Student " + (i + 1));
            updateStudent();
        }
		
	}

	@Override
	public void deleteStudent() {
		try {
            System.out.print("Enter ID to delete: ");
            int id = sc.nextInt();

            PreparedStatement ps = con.prepareStatement("DELETE FROM student WHERE id=?");
            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows > 0) System.out.println("Student deleted successfully!");
            else System.out.println("Student not found!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void deleteMultipleStudents() {
		System.out.print("Enter number of students to delete: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nDeleting Student " + (i + 1));
            deleteStudent();
        }
		
	}

	@Override
	public void showStudents() {
		try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            System.out.println("\n------------------------------------------");
            System.out.printf("%-10s %-20s %-10s %-15s\n", "ID", "NAME", "AGE", "COURSE");
            System.out.println("------------------------------------------");
            while (rs.next()) {
                System.out.printf("%-10d %-20s %-10d %-15s\n",
                        rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
            }
            System.out.println("------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}
	

}
