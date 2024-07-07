package steamfake.model;

import java.sql.Date;
import java.util.Objects;
import java.util.UUID;

public class Account {

    private UUID id;
    private String username;
    private String password;
    private String hoTen;
    private String email;
    private int gioiTinh;
    private String phone;
    private boolean isBan;
    private boolean isAdmin;
    private String avatar;
    private Date dob;
    private float soDuGame;
    private float soDuThuNhap;
    private Date ngayTao;

    public Account(String username) {
        this.username = username;
    }

    public Account(UUID id) {
        this.id = id;
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isBan() {
        return isBan;
    }

    public void setBan(boolean ban) {
        isBan = ban;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public float getSoDuGame() {
        return soDuGame;
    }

    public void setSoDuGame(float soDuGame) {
        this.soDuGame = soDuGame;
    }

    public float getSoDuThuNhap() {
        return soDuThuNhap;
    }

    public void setSoDuThuNhap(float soDuThuNhap) {
        this.soDuThuNhap = soDuThuNhap;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}