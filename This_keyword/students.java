// This keyword

class students {
	String Name;
    void GetInfo(String Name){
        this.Name = Name;
        System.out.println("My Name is : "+Name);
    }

    void GetBooks(String Book){
        System.out.println("The Books Name is : "+Book);
        System.out.println("Student Name : "+Name);
    }

    public static void main(String[] args) {
        students st = new students();

        st.GetInfo("Omji");
        st.GetBooks("JAVA SE");
    }

}
