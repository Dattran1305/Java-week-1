class Person {
    private double salary; // Thuộc tính private

    // Phương thức getter
    public double getSalary() {
        return salary;
    }

    // Phương thức setter và kiểm tra hợp lệ
    public void setSalary(double salary) {
        if (salary >= 1000) { // Kiểm tra nếu lương lớn hơn hoặc bằng 1000
            this.salary = salary;
        } else {
            System.out.println("Lương phải ít nhất 1000.");
        }
    }
} // Đảm bảo có dấu đóng class

        
    
