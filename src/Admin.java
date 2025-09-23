class Admin extends User {
    @Override
    public String getRole() {
        return "Admin";
    }
}