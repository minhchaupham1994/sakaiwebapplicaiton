========================================
Các phần mềm cần setup
========================================
1. JDK 
2. Oracle DB
3. Eclipse
4. Maven (+ setup environment)
----------------------------------------

========================================
Setup Oracle
========================================
1. Cài đặt Oracle DB
2. Unlock account HR
	2.1. Open cmd with adminsitrator
	2.2. Type 'sqlplus / as sysdba'
	2.3. Type 'ALTER USER HR ACCOUNT UNLOCK IDENTIFIED BY hr;'
	
3. Open SQL developer
4. Add new connection with username 'hr' and password 'hr' and Connect
5. Drop all tables in HR schema
6. Run setup/ORACL-STARTUP.sql script to create DB.

----------------------------------------

========================================
Version control
========================================
1. Checkout trunk tại: https://github.com/minhchaupham1994/sakaiwebapplicaiton.git/trunk
2. Checkout dev branch tại: https://github.com/minhchaupham1994/sakaiwebapplicaiton.git/branches/<dev_name>
3. Mỗi người sẽ làm việc trên dev branch của mình. Sau khi test chạy ổn định mới merge từ dev branch vào trunk.
4. Qui ước comment khi commit lên trunk: mô tả ngắn gọn về tính năng được update.
----------------------------------------

========================================
Cách import project vào eclipse
========================================
1. Mở cmd shell tại thư mục project
2. Chạy lệnh 'mvn eclipse:eclipse' để tạo file .classpath và .project 
3. Mở Eclipse, File > Import > General > Existing project... > Browse tới thư mục project > Finish
4. Chọn project, nhấn tổ  hợp phím Ctrl+Alt+T để open terminal. Gõ mvn spring-boot:run để chạy chương trình. Lệnh mvn spring-boot:run sẽ được dùng xuyên suốt quá trình code.
5. Vào http://localhost:8099/login để test
----------------------------------------









