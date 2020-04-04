create database thoitrang charset utf8 collate utf8_general_ci
use thoitrang
create table CHUCVU(
machucvu integer auto_increment primary key,
tenchucvu nvarchar(20)
)

create table NHANVIEN(
manhanvien integer auto_increment primary key,
hoten nvarchar(50),
diachi nvarchar(50),
gioitinh boolean,
cmnd nvarchar(20),
sodt integer,
machucvu integer,
email nvarchar(50),
tendangnhap varchar(20),
matkhau varchar(20),
constraint FK_NHANVIEN_CHUCVU foreign key(machucvu) references CHUCVU(machucvu)
)
create table DANHMUCSANPHAM(
madanhmuc integer auto_increment primary key,
tendanhmuc nvarchar(100),
hinhdanhmuc text
)
create table SANPHAM(
masanpham integer auto_increment primary key,
madanhmuc integer,
tensanpham nvarchar(100),
giatien integer,
mota nvarchar(200),
hinhsanpham text,
constraint FK_SANPHAM_DANHMUC foreign key(madanhmuc) references DANHMUCSANPHAM(madanhmuc)
)
create table MAUSANPHAM(
mamau integer auto_increment primary key,
tenmau nvarchar(50) 
)
create table SIZESANPHAM(
masize integer auto_increment primary key,
size nvarchar(20)
)
create table CHITIETSANPHAM(
machitietsanpham integer auto_increment primary key,
masanpham integer,
masize integer,
mamau integer,
soluong integer,
ngaynhap nvarchar(50),
constraint FK_CHITIET_SANPHAM foreign key(masanpham) references SANPHAM(masanpham),
constraint FK_CHITIET_SIZE foreign key(masize) references SIZESANPHAM(masize),
constraint FK_SANPHAM_MAUSANPHAM foreign key(mamau) references MAUSANPHAM(mamau)
)
create table KHUYENMAI(
makhuyenmai integer auto_increment primary key,
tenkhuyenmai nvarchar(50),
thoigianbatdau nvarchar(50),
thoigianketthuc nvarchar(50),
mota nvarchar(200),
hinhkhuyenmai text,
giagiam integer
)
create table CHITIETKHUYENMAI(
makhuyenmai integer,
masanpham integer,
primary key(makhuyenmai,masanpham),

constraint FK_CHITIETKHUYENMAI_SANPHAM foreign key(masanpham) references SANPHAM(masanpham)
)
create table HOADON(
mahoadon integer auto_increment primary key,
tenkhachhang nvarchar(100),
sodt nvarchar(12),
diachigiaohang nvarchar(200),
tinhtrang boolean,
ngaylap nvarchar(50)
)

create table CHITIETHOADON(
mahoadon integer ,
machitietsanpham integer,
soluong integer,
giatien integer,
primary key(mahoadon,machitietsanpham),
constraint FK_CHITIETHOADON_HOADON foreign key(mahoadon) references HOADON(mahoadon),
constraint FK_CHITIETHOADON_CHITIETSANPHAM foreign key(machitietsanpham) references CHITIETSANPHAM(machitietsanpham)
)
INSERT INTO `thoitrang`.`nhanvien` (`manhanvien`, `hoten`, `diachi`, `gioitinh`, `cmnd`, `machucvu`, `email`, `tendangnhap`, `matkhau`) VALUES ('1', 'Đặng Mạnh Tuấn', 'Hà Nội', '0', '0354231548', '2', 'tuanmanh322@gmail.com', 'tuanmanh322@gmail.com', '123456');
INSERT INTO `thoitrang`.`nhanvien` (`manhanvien`, `hoten`, `diachi`, `gioitinh`, `cmnd`, `machucvu`, `email`, `tendangnhap`, `matkhau`) VALUES ('2', 'Nguyễn Văn A', 'Hà Nội', '0', '0354231548', '2', 'aaaa@gmail.com', 'aaaa@gmail.com', '123456');
INSERT INTO `thoitrang`.`nhanvien` (`manhanvien`, `hoten`, `diachi`, `gioitinh`, `cmnd`, `machucvu`, `email`, `tendangnhap`, `matkhau`) VALUES ('3', 'Nguyễn Thị C', 'Hà Nội', '0', '0354231548', '2', 'a1234@gmail.com', 'a1234@gmail.com', '123456');