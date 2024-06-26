package OOPS;

class AdminUser extends User{
    private String adminRole;

    public AdminUser(int userId, String userName, String email, int age, double balance,String adminRole) {
        super(userId, userName, email, age, balance);
        this.adminRole=adminRole;
        //TODO Auto-generated constructor stub
    }

    public String getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }

    @Override
    public void displayUserInfo() {
        // TODO Auto-generated method stub
        super.displayUserInfo();
        System.out.println("Admin role:"+adminRole);
    }

    @Override
    public void updateUserBalance(double amount) {
        // TODO Auto-generated method stub
        super.updateUserBalance(amount);
        System.out.println("Admin Updated balance .");
    }



    
}
