/*
 Navicat Premium Dump SQL

 Source Server         : steakvn
 Source Server Type    : SQL Server
 Source Server Version : 12005624 (12.00.5624)
 Source Host           : bravosdb.database.windows.net:1433
 Source Catalog        : steakvn
 Source Schema         : dbo

 Target Server Type    : SQL Server
 Target Server Version : 12005624 (12.00.5624)
 File Encoding         : 65001

 Date: 22/08/2024 16:17:28
*/


-- ----------------------------
-- Table structure for ACCOUNT
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[ACCOUNT]') AND type IN ('U'))
	DROP TABLE [dbo].[ACCOUNT]
GO

CREATE TABLE [dbo].[ACCOUNT] (
  [id] uniqueidentifier  NOT NULL,
  [username] varchar(32) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [password] varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [ho_ten] nvarchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [email] varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [gioi_tinh] tinyint  NOT NULL,
  [phone] varchar(16) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [isBan] bit  NOT NULL,
  [isAdmin] bit  NOT NULL,
  [dob] date  NOT NULL,
  [so_du_game] money DEFAULT 0 NOT NULL,
  [so_du_kdoanh] money DEFAULT 0 NOT NULL,
  [create_time] date DEFAULT getdate() NULL,
  [avatar] nvarchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL
)
GO

ALTER TABLE [dbo].[ACCOUNT] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of ACCOUNT
-- ----------------------------
INSERT INTO [dbo].[ACCOUNT] ([id], [username], [password], [ho_ten], [email], [gioi_tinh], [phone], [isBan], [isAdmin], [dob], [so_du_game], [so_du_kdoanh], [create_time], [avatar]) VALUES (N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'baotphcm1612', N'$2a$10$hqRVkrXsk/foDmG0eYr31.Lr7weJsNHW4BAWrRcuMvBSdV5ymPOyq', N'Elon Musk', N'quocbao2k5xtt@gmail.com', N'2', NULL, N'0', N'0', N'2005-12-16', N'0.0000', N'0.0000', N'2024-08-17', NULL)
GO

INSERT INTO [dbo].[ACCOUNT] ([id], [username], [password], [ho_ten], [email], [gioi_tinh], [phone], [isBan], [isAdmin], [dob], [so_du_game], [so_du_kdoanh], [create_time], [avatar]) VALUES (N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'admin', N'$2a$10$sF5p01uVZEE.2Awz7nHvg.QXiRRxHfTitlCGjRjH28dOGF9zOfvK.', N'Administrator', N'baonqps41272@gmail.com', N'0', N'0704795312', N'0', N'0', N'2005-12-16', N'0.0000', N'0.0000', N'2024-08-17', NULL)
GO


-- ----------------------------
-- Table structure for BANK
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[BANK]') AND type IN ('U'))
	DROP TABLE [dbo].[BANK]
GO

CREATE TABLE [dbo].[BANK] (
  [ID] int  IDENTITY(1,1) NOT NULL,
  [name] nvarchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [trang_thai] bit  NOT NULL,
  [BIN] varchar(6) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL
)
GO

ALTER TABLE [dbo].[BANK] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of BANK
-- ----------------------------
SET IDENTITY_INSERT [dbo].[BANK] ON
GO

SET IDENTITY_INSERT [dbo].[BANK] OFF
GO


-- ----------------------------
-- Table structure for BANK_ACCOUNT
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[BANK_ACCOUNT]') AND type IN ('U'))
	DROP TABLE [dbo].[BANK_ACCOUNT]
GO

CREATE TABLE [dbo].[BANK_ACCOUNT] (
  [account_id] uniqueidentifier  NOT NULL,
  [bank_id] int  NOT NULL,
  [so_tai_khoan] varchar(20) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [id] uniqueidentifier  NOT NULL
)
GO

ALTER TABLE [dbo].[BANK_ACCOUNT] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of BANK_ACCOUNT
-- ----------------------------

-- ----------------------------
-- Table structure for CARD
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[CARD]') AND type IN ('U'))
	DROP TABLE [dbo].[CARD]
GO

CREATE TABLE [dbo].[CARD] (
  [phieu_nap_id] uniqueidentifier  NOT NULL,
  [secret_key] varchar(30) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [seri] varchar(30) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [nha_mang] smallint  NULL
)
GO

ALTER TABLE [dbo].[CARD] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of CARD
-- ----------------------------

-- ----------------------------
-- Table structure for GAME
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[GAME]') AND type IN ('U'))
	DROP TABLE [dbo].[GAME]
GO

CREATE TABLE [dbo].[GAME] (
  [id] uniqueidentifier  NOT NULL,
  [publisher_id] uniqueidentifier  NOT NULL,
  [name] nvarchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [avatar] nvarchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [gia_tien] float(53)  NOT NULL,
  [age] smallint  NOT NULL,
  [images] nvarchar(max) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [mo_ta] nvarchar(max) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [ram] int  NOT NULL,
  [rom] int  NOT NULL,
  [release_date] date DEFAULT getdate() NULL,
  [update_date] date DEFAULT getdate() NULL,
  [version] nvarchar(128) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [isOpened] bit DEFAULT 1 NULL,
  [exec_file] varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL
)
GO

ALTER TABLE [dbo].[GAME] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of GAME
-- ----------------------------
INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'6C9F6131-1E33-49D7-AB82-00BB20415479', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Final Fantasy XVI', N'header (1).jpg', N'899000', N'18', N'["ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg","ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_1702e9bc7ba4ce2dce2555c8d63612aafb5c757a.1920x1080.jpg"]', N'Khám phá một thế giới huyền bí với những trận chiến ngoạn mục và cốt truyện sâu sắc trong phần mới nhất của series Final Fantasy.', N'8192', N'32768', N'2020-04-01', N'2024-08-17', N'1.0', N'0', N'Songoku 1/GAME-SONGOKU-1.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'F619FF08-01DA-4C20-9B2A-05D2503F1810', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Genshin Impact', N'header (10).jpg', N'649000', N'18', N'["ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_f6f995f4dab00ab33dae1b7a0c05cc0ab8e7d62e.1920x1080.jpg","ss_08b2e18dbb11333791d35fed9338a6e6eedd923a.1920x1080.jpg","ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg","ss_23da24c6bfb4ef8af767aee077d0cc146892153a.1920x1080.jpg"]', N'Khám phá thế giới mở của Teyvat, chiến đấu với các kẻ thù và tìm kiếm em của bạn trong cuộc phiêu lưu kỳ diệu.', N'8192', N'32768', N'2023-10-01', N'2024-08-17', N'1.0', N'0', N'Songoku 2/GAME-SONGOKU-2.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'68633546-0165-412B-BBC7-063ED5410A1C', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Sekiro: Shadows Die Twice', N'header (11).jpg', N'789000', N'18', N'["ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg","ss_f4ec953421c54bf74bdca77ceed361ad7b509858.1920x1080.jpg","ss_119e7890b990201c6ca61280a76851dc0ced05f9.1920x1080.jpg","ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg","ss_90f5785f89a9882a7f33fd5a812a7e7384720afd.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg"]', N'Theo chân một ninja trong cuộc phiêu lưu đầy mạo hiểm và đối mặt với các kẻ thù mạnh mẽ trong thời kỳ Sengoku.', N'8192', N'16384', N'2023-09-01', N'2024-08-17', N'1.0', N'0', N'Songoku 3/GAME-SONGOKU-3.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'878B88ED-DED8-4B34-BFCE-082E3172C0DE', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Control', N'header (12).jpg', N'749000', N'18', N'["ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg","ss_e0b90753a55e638cac98b6b7b4f4c44b5242ceed.1920x1080.jpg","ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg","ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg","ss_8cc0dee7b6d6a4ece1f00a1a8fdedfc8d12a3cb6.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg"]', N'Khám phá một tòa nhà kỳ bí với các hiện tượng siêu nhiên và tham gia vào cuộc chiến chống lại các thế lực bí ẩn.', N'8192', N'32768', N'2023-01-01', N'2024-08-17', N'1.0', N'0', N'Songoku 4/GAME-SONGOKU-4.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'C805AFC3-7320-4E0B-8E02-0B8A71AE0BD2', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Star Wars Jedi: Survivor', N'header (2).jpg', N'849000', N'18', N'["ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_f6f995f4dab00ab33dae1b7a0c05cc0ab8e7d62e.1920x1080.jpg"]', N'Nhập vai vào một Jedi và tham gia vào cuộc phiêu lưu trong thế giới Star Wars với các trận chiến ánh sáng và câu chuyện hấp dẫn.', N'8192', N'32768', N'2023-10-01', N'2024-08-17', N'1.0', N'0', N'Songoku 5/GAME-SONGOKU-5.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'A5B2AEF0-EE27-402D-AB40-0D22A63DCE11', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Cyberpunk 2077', N'header (3).jpg', N'899000', N'18', N'["ss_119e7890b990201c6ca61280a76851dc0ced05f9.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_f4ec953421c54bf74bdca77ceed361ad7b509858.1920x1080.jpg","ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg","ss_f6f995f4dab00ab33dae1b7a0c05cc0ab8e7d62e.1920x1080.jpg"]', N'Khám phá một thế giới tương lai đầy rẫy tội phạm và công nghệ tiên tiến, nơi bạn có thể tạo dựng vận mệnh của mình trong một thành phố rộng lớn và sống động.', N'8192', N'32768', N'2019-07-01', N'2024-08-17', N'1.0', N'0', N'Songoku 6/GAME-SONGOKU-6.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'A603508A-2A97-4FAA-B56E-1097FE2F0837', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Dark Souls III', N'header (4).jpg', N'759000', N'18', N'["ss_80d442d735c80a31c78696aeaaae08c0bf843a0f.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_8cc0dee7b6d6a4ece1f00a1a8fdedfc8d12a3cb6.1920x1080.jpg","ss_08b2e18dbb11333791d35fed9338a6e6eedd923a.1920x1080.jpg","ss_654f59aa78b9a2c6192a3a63b752eff6c1b78d48.1920x1080.jpg"]', N'Nhập vai vào một thế giới đen tối, chiến đấu với các quái vật và khám phá những bí ẩn trong hành trình đầy thử thách.', N'8192', N'16384', N'2023-08-01', N'2024-08-17', N'1.0', N'0', N'Songoku 7/GAME-SONGOKU-7.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'E2DA8C70-C15C-4B33-A4C8-1257719966EC', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'The Witcher 3: Wild Hunt', N'header (5).jpg', N'799000', N'18', N'["ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_51db7d9662052c2a6adac07234469780437620a4.1920x1080.jpg","ss_f4ec953421c54bf74bdca77ceed361ad7b509858.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg"]', N'Khám phá thế giới mở rộng lớn trong vai trò của Geralt of Rivia trong cuộc phiêu lưu đầy nguy hiểm.', N'8192', N'32768', N'2023-01-01', N'2024-08-17', N'1.0', N'0', N'Songoku 8/GAME-SONGOKU-8.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'05A499BF-4B7B-437A-8619-12BD6D593FB6', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Final Fantasy VII Remake', N'header (6).jpg', N'899000', N'18', N'["ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg","ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg","ss_e0b90753a55e638cac98b6b7b4f4c44b5242ceed.1920x1080.jpg","ss_23da24c6bfb4ef8af767aee077d0cc146892153a.1920x1080.jpg","ss_80d442d735c80a31c78696aeaaae08c0bf843a0f.1920x1080.jpg"]', N'Khám phá lại câu chuyện cổ điển của Final Fantasy VII với đồ họa và gameplay được làm mới.', N'8192', N'32768', N'2023-03-01', N'2024-08-17', N'1.0', N'0', N'Songoku 9/GAME-SONGOKU-9.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'90073956-A6C8-4968-9A75-14093F570F66', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'NieR: Automata', N'header (7).jpg', N'799000', N'18', N'["ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_e0b90753a55e638cac98b6b7b4f4c44b5242ceed.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_80d442d735c80a31c78696aeaaae08c0bf843a0f.1920x1080.jpg","ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg"]', N'Khám phá thế giới hậu khải huyền với các nhân vật android trong cuộc chiến chống lại các sinh vật máy móc.', N'8192', N'32768', N'2023-02-01', N'2024-08-17', N'1.0', N'0', N'Songoku 10/GAME-SONGOKU-10.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'A63CE7B6-BA01-4207-9657-167F82ABF21B', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'The Outer Worlds', N'header (8).jpg', N'799000', N'18', N'["ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg","ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg"]', N'Nhập vai vào một người du hành trong không gian, khám phá các hành tinh kỳ lạ và thực hiện các nhiệm vụ trong một thế giới mở với cốt truyện hấp dẫn.', N'8192', N'32768', N'2019-04-01', N'2024-08-17', N'1.0', N'0', N'Songoku 11/GAME-SONGOKU-11.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'516AF636-DACA-4FB2-AC48-1D51908AE3FC', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Assassin Creed Valhalla', N'header (9).jpg', N'999000', N'18', N'["ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_08b2e18dbb11333791d35fed9338a6e6eedd923a.1920x1080.jpg","ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg"]', N'Tham gia vào cuộc chinh phạt nước Anh của người Viking trong vai trò Eivor.', N'8192', N'32768', N'2023-09-01', N'2024-08-17', N'1.0', N'0', N'Songoku 12/GAME-SONGOKU-12.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'7F80D480-252D-4534-ABEF-1D646B209A4D', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Ghost of Tsushima', N'header.jpg', N'749000', N'18', N'["ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg"]', N'Khám phá thế giới mở của Nhật Bản thời kỳ samurai và chiến đấu chống lại cuộc xâm lược của người Mông Cổ.', N'8192', N'32768', N'2023-03-01', N'2024-08-17', N'1.0', N'0', N'Songoku 13/GAME-SONGOKU-13.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'8E67BD49-4855-4FFA-8055-22D297738CD4', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Dragon Age: Inquisition', N'header3.jpg', N'799000', N'18', N'["ss_119e7890b990201c6ca61280a76851dc0ced05f9.1920x1080.jpg","ss_90f5785f89a9882a7f33fd5a812a7e7384720afd.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg"]', N'Khám phá một thế giới đầy rẫy rồng và ma thuật trong một cuộc phiêu lưu RPG đầy kịch tính.', N'8192', N'32768', N'2019-01-01', N'2024-08-17', N'1.0', N'0', N'Songoku 1/GAME-SONGOKU-1.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'7EA8A3A2-8E3B-4508-B52A-2AA24CD43EA0', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Ghost of Tsushima', N'header_alt_assets_0.jpg', N'799000', N'18', N'["ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_72cb10fb8f0c7554e932257450b19189534a846d.1920x1080.jpg","ss_90f5785f89a9882a7f33fd5a812a7e7384720afd.1920x1080.jpg","ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg"]', N'Nhập vai vào một samurai cuối cùng trong cuộc chiến chống lại cuộc xâm lược của người Mông Cổ. Trải nghiệm một thế giới mở tuyệt đẹp và chiến đấu với kỹ năng samurai.', N'8192', N'32768', N'2019-10-01', N'2024-08-17', N'1.0', N'0', N'Songoku 2/GAME-SONGOKU-2.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'A6731762-9CEA-4C80-8104-2AC505912F8D', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Resident Evil Village', N'header_alt_assets_11.jpg', N'849000', N'18', N'["ss_f6f995f4dab00ab33dae1b7a0c05cc0ab8e7d62e.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg","ss_8cc0dee7b6d6a4ece1f00a1a8fdedfc8d12a3cb6.1920x1080.jpg"]', N'Khám phá một ngôi làng ma quái đầy rẫy quái vật và bí ẩn. Trải nghiệm cảm giác hồi hộp và sự sợ hãi trong cuộc chiến sinh tồn đầy kịch tính.', N'8192', N'32768', N'2020-01-01', N'2024-08-17', N'1.0', N'0', N'Songoku 3/GAME-SONGOKU-3.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'0A557C22-5E90-47A3-9D21-2D7E89330DF7', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'NBA 2K24', N'header (1).jpg', N'759000', N'3', N'["ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_72cb10fb8f0c7554e932257450b19189534a846d.1920x1080.jpg","ss_51db7d9662052c2a6adac07234469780437620a4.1920x1080.jpg","ss_119e7890b990201c6ca61280a76851dc0ced05f9.1920x1080.jpg","ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg"]', N'Trải nghiệm bóng rổ với các đội bóng nổi tiếng, chế độ chơi phong phú và đồ họa ấn tượng.', N'8192', N'32768', N'2023-10-01', N'2024-08-17', N'1.0', N'0', N'Songoku 4/GAME-SONGOKU-4.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'1473A7D8-DE01-4832-9639-313E1A2697FB', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Dragon Quest XI', N'header (10).jpg', N'799000', N'18', N'["ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_51db7d9662052c2a6adac07234469780437620a4.1920x1080.jpg","ss_90f5785f89a9882a7f33fd5a812a7e7384720afd.1920x1080.jpg","ss_72cb10fb8f0c7554e932257450b19189534a846d.1920x1080.jpg","ss_f6f995f4dab00ab33dae1b7a0c05cc0ab8e7d62e.1920x1080.jpg"]', N'Tham gia vào cuộc phiêu lưu tuyệt vời trong một thế giới giả tưởng đầy rồng và các sinh vật kỳ bí.', N'8192', N'32768', N'2019-08-01', N'2024-08-17', N'1.0', N'0', N'Songoku 5/GAME-SONGOKU-5.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'DB4DE667-8202-4FF7-B91D-353096C9757E', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Assassins Creed Mirage', N'header (11).jpg', N'799000', N'18', N'["ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_e0b90753a55e638cac98b6b7b4f4c44b5242ceed.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg","ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg"]', N'Khám phá những bí ẩn của thành phố cổ đại và tham gia vào cuộc phiêu lưu của một sát thủ trong một thế giới mở đầy hấp dẫn.', N'8192', N'32768', N'2020-07-01', N'2024-08-17', N'1.0', N'0', N'Songoku 6/GAME-SONGOKU-6.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'5D561188-5B15-4E55-9B98-3B9B79C1EEF0', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Kingdom Come: Deliverance', N'header (12).jpg', N'759000', N'18', N'["ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_119e7890b990201c6ca61280a76851dc0ced05f9.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg","ss_08b2e18dbb11333791d35fed9338a6e6eedd923a.1920x1080.jpg","ss_1702e9bc7ba4ce2dce2555c8d63612aafb5c757a.1920x1080.jpg"]', N'Trải nghiệm cuộc sống trong thế kỷ 15 tại Bohemia, với một thế giới mở và hệ thống gameplay chân thực.', N'8192', N'32768', N'2023-06-01', N'2024-08-17', N'1.0', N'0', N'Songoku 7/GAME-SONGOKU-7.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'C57C1AA1-A811-4A73-8593-3D7FA55D1AA4', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Rage 2', N'header (2).jpg', N'699000', N'18', N'["ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_23da24c6bfb4ef8af767aee077d0cc146892153a.1920x1080.jpg"]', N'Khám phá một thế giới mở đầy hỗn loạn và chiến đấu chống lại các băng nhóm trong một cuộc phiêu lưu bắn súng đầy hành động.', N'8192', N'32768', N'2023-09-01', N'2024-08-17', N'1.0', N'0', N'Songoku 8/GAME-SONGOKU-8.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'387C8D60-CE0F-41DC-B100-41F50FA4DDA7', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Rainbow Six Siege', N'header (3).jpg', N'679000', N'18', N'["ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_f6f995f4dab00ab33dae1b7a0c05cc0ab8e7d62e.1920x1080.jpg","ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg","ss_08b2e18dbb11333791d35fed9338a6e6eedd923a.1920x1080.jpg","ss_80d442d735c80a31c78696aeaaae08c0bf843a0f.1920x1080.jpg"]', N'Tham gia vào các trận chiến chiến thuật đa dạng với sự phối hợp của đội và chiến lược trong các môi trường đa dạng.', N'8192', N'32768', N'2023-08-01', N'2024-08-17', N'1.0', N'0', N'Songoku 9/GAME-SONGOKU-9.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'5D59410D-04B0-46B2-9268-424B4FE4E66D', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Overwatch 2', N'header (4).jpg', N'649000', N'12', N'["ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_90f5785f89a9882a7f33fd5a812a7e7384720afd.1920x1080.jpg","ss_8cc0dee7b6d6a4ece1f00a1a8fdedfc8d12a3cb6.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg"]', N'Tham gia vào các trận đấu đội hình 6v6 với các anh hùng độc đáo và kỹ năng đặc biệt trong thế giới tương lai.', N'8192', N'32768', N'2023-05-01', N'2024-08-17', N'1.0', N'0', N'Songoku 10/GAME-SONGOKU-10.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'9D7689BF-90DF-468C-97B6-45F387FCE16C', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Doom Eternal', N'header (5).jpg', N'849000', N'18', N'["ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_51db7d9662052c2a6adac07234469780437620a4.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg"]', N'Khám phá thế giới địa ngục với đồ họa ấn tượng và gameplay hành động không ngừng nghỉ. Đối mặt với các thế lực ma quái trong một cuộc chiến tàn khốc.', N'8192', N'32768', N'2019-01-01', N'2024-08-17', N'1.0', N'0', N'Songoku 11/GAME-SONGOKU-11.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'CAE6D50E-6440-49ED-9DA3-47CD4E48D6B2', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Gran Turismo 7', N'header (6).jpg', N'899000', N'3', N'["ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_e0b90753a55e638cac98b6b7b4f4c44b5242ceed.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg"]', N'Tận hưởng trải nghiệm đua xe chân thực với dàn xe phong phú và các đường đua tuyệt đẹp.', N'8192', N'32768', N'2023-02-01', N'2024-08-17', N'1.0', N'0', N'Songoku 12/GAME-SONGOKU-12.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'4189E520-608F-41B4-B8BC-4FDEAC0CEFE5', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Assassin’s Creed Valhalla', N'header (7).jpg', N'849000', N'18', N'["ss_e0b90753a55e638cac98b6b7b4f4c44b5242ceed.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg","ss_6416651523d0158b6fefd982d4f3e88876812227.1920x1080.jpg","ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg"]', N'Khám phá thế giới Viking rộng lớn và tham gia vào các trận chiến lịch sử trong cuộc phiêu lưu đầy phong cách.', N'8192', N'32768', N'2023-05-01', N'2024-08-17', N'1.0', N'0', N'Songoku 13/GAME-SONGOKU-13.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'7846D4D9-14BC-4550-BE77-5562165FAB19', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Borderlands: The Pre-Sequel', N'header (8).jpg', N'649000', N'18', N'["ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg","ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_51db7d9662052c2a6adac07234469780437620a4.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_8cc0dee7b6d6a4ece1f00a1a8fdedfc8d12a3cb6.1920x1080.jpg"]', N'Khám phá những câu chuyện mới trong thế giới Pandora và trải nghiệm cuộc phiêu lưu bắn súng với nhiều nhân vật độc đáo.', N'8192', N'32768', N'2023-10-01', N'2024-08-17', N'1.0', N'0', N'Songoku 1/GAME-SONGOKU-1.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'0C6B3468-1712-4CA7-BF38-5F3876B6CD3C', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Horizon Zero Dawn', N'header (9).jpg', N'699000', N'18', N'["ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg"]', N'Khám phá thế giới hậu khải huyền với Aloy, chiến đấu với các sinh vật máy móc và tìm hiểu nguồn gốc của thế giới.', N'8192', N'32768', N'2023-06-01', N'2024-08-17', N'1.0', N'0', N'Songoku 2/GAME-SONGOKU-2.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'4018BC44-7AC2-44B6-A73C-64D7FD70AA08', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Persona 5 Royal', N'header.jpg', N'699000', N'16', N'["ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg","ss_8cc0dee7b6d6a4ece1f00a1a8fdedfc8d12a3cb6.1920x1080.jpg","ss_90f5785f89a9882a7f33fd5a812a7e7384720afd.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg"]', N'Khám phá cuộc sống học đường và thế giới ngầm của Tokyo trong vai trò của một học sinh trung học với khả năng đặc biệt.', N'8192', N'16384', N'2023-04-01', N'2024-08-17', N'1.0', N'0', N'Songoku 3/GAME-SONGOKU-3.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'83345B4C-9EDB-4E65-9667-6BCB6F2E7ABA', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'No Mans Sky', N'header3.jpg', N'699000', N'12', N'["ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg","ss_23da24c6bfb4ef8af767aee077d0cc146892153a.1920x1080.jpg","ss_1702e9bc7ba4ce2dce2555c8d63612aafb5c757a.1920x1080.jpg","ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg","ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg"]', N'Khám phá vũ trụ rộng lớn với hàng triệu hành tinh khác nhau và tham gia vào cuộc phiêu lưu không giới hạn.', N'8192', N'32768', N'2023-06-01', N'2024-08-17', N'1.0', N'0', N'Songoku 4/GAME-SONGOKU-4.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'AEA5D123-2334-4EB3-897A-6FA501C23508', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'God of War', N'header_alt_assets_0.jpg', N'759000', N'18', N'["ss_8cc0dee7b6d6a4ece1f00a1a8fdedfc8d12a3cb6.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg"]', N'Theo chân Kratos trong cuộc hành trình đầy hành động để báo thù và tìm hiểu về thần thoại Bắc Âu.', N'8192', N'16384', N'2023-04-01', N'2024-08-17', N'1.0', N'0', N'Songoku 5/GAME-SONGOKU-5.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'D08AA2F7-B3E6-4133-BC20-70601DED6945', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Watch Dogs: Legion', N'header_alt_assets_11.jpg', N'799000', N'18', N'["ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg","ss_1702e9bc7ba4ce2dce2555c8d63612aafb5c757a.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg"]', N'Tham gia vào một thế giới mở tại London và chiến đấu để giải phóng thành phố khỏi sự kiểm soát của các thế lực độc tài.', N'8192', N'32768', N'2021-04-01', N'2024-08-17', N'1.0', N'0', N'Songoku 6/GAME-SONGOKU-6.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'707E7CD7-5131-4192-8D92-739AC22F6EB5', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Assassin Creed Brotherhood', N'header (1).jpg', N'549000', N'18', N'["ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg","ss_8cc0dee7b6d6a4ece1f00a1a8fdedfc8d12a3cb6.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg","ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg","ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg"]', N'Chiến đấu với tổ chức Templar trong cuộc phiêu lưu mở rộng tại Rome.', N'4096', N'20480', N'2023-02-01', N'2024-08-17', N'1.0', N'0', N'Songoku 7/GAME-SONGOKU-7.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'1DD0774A-6466-4513-BDA4-79C31C9CFE0C', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Far Cry 6', N'header (10).jpg', N'849000', N'18', N'["ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg","ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg"]', N'Khám phá một hòn đảo nhiệt đới và tham gia vào cuộc chiến chống lại chế độ độc tài trong một thế giới mở đầy phong phú.', N'8192', N'32768', N'2021-01-01', N'2024-08-17', N'1.0', N'0', N'Songoku 8/GAME-SONGOKU-8.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'26161E19-7FD7-4E14-9997-7A56C0BB4CE7', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Assassin Creed Unity', N'header (11).jpg', N'749000', N'18', N'["ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_80d442d735c80a31c78696aeaaae08c0bf843a0f.1920x1080.jpg","ss_72cb10fb8f0c7554e932257450b19189534a846d.1920x1080.jpg","ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg","ss_90f5785f89a9882a7f33fd5a812a7e7384720afd.1920x1080.jpg","ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg"]', N'Khám phá Paris trong cuộc cách mạng Pháp và chiến đấu chống lại Templar.', N'8192', N'32768', N'2023-05-01', N'2024-08-17', N'1.0', N'0', N'Songoku 9/GAME-SONGOKU-9.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'6D3CC8AE-CAFE-49BF-BA95-7A7E453D8DBB', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Hitman 3', N'header (12).jpg', N'799000', N'18', N'["ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg","ss_72cb10fb8f0c7554e932257450b19189534a846d.1920x1080.jpg"]', N'Nhập vai vào sát thủ chuyên nghiệp và thực hiện các nhiệm vụ toàn cầu với các phương pháp tiếp cận khác nhau.', N'8192', N'32768', N'2023-07-01', N'2024-08-17', N'1.0', N'0', N'Songoku 10/GAME-SONGOKU-10.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'B71B4567-9B97-4EA8-976F-7B292FD3E4EF', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Cyberpunk 2077', N'header (2).jpg', N'849000', N'18', N'["ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_6416651523d0158b6fefd982d4f3e88876812227.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg","ss_90f5785f89a9882a7f33fd5a812a7e7384720afd.1920x1080.jpg"]', N'Nhập vai vào một thế giới tương lai trong cuộc phiêu lưu mạo hiểm với nhiều tùy chọn tùy chỉnh.', N'8192', N'32768', N'2023-02-01', N'2024-08-17', N'1.0', N'0', N'Songoku 11/GAME-SONGOKU-11.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'BB12B6A2-30C7-4CAE-BA10-88B6E6CFB4CF', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Call of Duty: Modern Warfare II', N'header (3).jpg', N'849000', N'18', N'["ss_8cc0dee7b6d6a4ece1f00a1a8fdedfc8d12a3cb6.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_80d442d735c80a31c78696aeaaae08c0bf843a0f.1920x1080.jpg","ss_08b2e18dbb11333791d35fed9338a6e6eedd923a.1920x1080.jpg","ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg","ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg"]', N'Trải nghiệm chiến đấu hiện đại với đồ họa cao cấp và gameplay chân thực trong cuộc chiến toàn cầu.', N'8192', N'32768', N'2023-01-01', N'2024-08-17', N'1.0', N'0', N'Songoku 12/GAME-SONGOKU-12.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'6F777214-D2A9-4DC2-B275-90B437230B33', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Madden NFL 24', N'header (4).jpg', N'749000', N'3', N'["ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_1702e9bc7ba4ce2dce2555c8d63612aafb5c757a.1920x1080.jpg","ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_f6f995f4dab00ab33dae1b7a0c05cc0ab8e7d62e.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg"]', N'Trải nghiệm mùa giải bóng bầu dục mới nhất với đồ họa cải tiến và cơ chế chơi chân thực.', N'8192', N'32768', N'2023-08-01', N'2024-08-17', N'1.0', N'0', N'Songoku 13/GAME-SONGOKU-13.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'2E394A10-D15A-44AD-B0F3-9318BED06DB5', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'CyberConnect2', N'header (5).jpg', N'799000', N'18', N'["ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_119e7890b990201c6ca61280a76851dc0ced05f9.1920x1080.jpg","ss_8cc0dee7b6d6a4ece1f00a1a8fdedfc8d12a3cb6.1920x1080.jpg","ss_1702e9bc7ba4ce2dce2555c8d63612aafb5c757a.1920x1080.jpg"]', N'Khám phá một thế giới mới với các nhiệm vụ đầy thách thức và các trận chiến ngoạn mục trong một game RPG độc đáo.', N'8192', N'32768', N'2022-01-01', N'2024-08-17', N'1.0', N'0', N'Songoku 1/GAME-SONGOKU-1.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'C3262CD7-D472-4CDB-8C95-A192C7468656', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Kingdom Come: Deliverance', N'header (6).jpg', N'759000', N'18', N'["ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_51db7d9662052c2a6adac07234469780437620a4.1920x1080.jpg","ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg","ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg"]', N'Trải nghiệm cuộc sống trong thế kỷ 15 tại Bohemia, với một thế giới mở và hệ thống gameplay chân thực.', N'8192', N'32768', N'2022-10-01', N'2024-08-17', N'1.0', N'0', N'Songoku 2/GAME-SONGOKU-2.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'942031F4-16B1-4E67-8F15-A38DC3926158', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Shadow of the Tomb Raider', N'header (7).jpg', N'759000', N'18', N'["ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_08b2e18dbb11333791d35fed9338a6e6eedd923a.1920x1080.jpg","ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg"]', N'Theo chân Lara Croft trong cuộc phiêu lưu mạo hiểm cuối cùng và khám phá các bí ẩn của nền văn minh cổ đại.', N'8192', N'32768', N'2023-04-01', N'2024-08-17', N'1.0', N'0', N'Songoku 3/GAME-SONGOKU-3.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'7BFA1BB9-F779-4804-BF9F-A45348EF999F', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Gears 5', N'header (8).jpg', N'749000', N'18', N'["ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg","ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg","ss_119e7890b990201c6ca61280a76851dc0ced05f9.1920x1080.jpg"]', N'Chiến đấu chống lại các thế lực tàn ác trong một thế giới hậu khải huyền với gameplay hành động đầy lôi cuốn.', N'8192', N'32768', N'2021-10-01', N'2024-08-17', N'1.0', N'0', N'Songoku 4/GAME-SONGOKU-4.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'3C3605BB-A243-4A61-8407-A5552029465B', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Wolfenstein: Youngblood', N'header (9).jpg', N'699000', N'18', N'["ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_08b2e18dbb11333791d35fed9338a6e6eedd923a.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_80d442d735c80a31c78696aeaaae08c0bf843a0f.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg"]', N'Chiến đấu trong cuộc chiến chống lại chế độ phát xít ở Paris với sự hỗ trợ của người bạn đồng hành.', N'8192', N'32768', N'2023-05-01', N'2024-08-17', N'1.0', N'0', N'Songoku 5/GAME-SONGOKU-5.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'A01990F3-82FA-4D26-97BC-A606AAC95208', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Dying Light 2', N'header.jpg', N'799000', N'18', N'["ss_72cb10fb8f0c7554e932257450b19189534a846d.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_119e7890b990201c6ca61280a76851dc0ced05f9.1920x1080.jpg"]', N'Khám phá thế giới mở đầy zombie và tham gia vào các cuộc phiêu lưu sống còn trong thành phố hậu khải huyền.', N'8192', N'32768', N'2023-02-01', N'2024-08-17', N'1.0', N'0', N'Songoku 6/GAME-SONGOKU-6.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'049F92DA-2986-4977-BA35-A819A5C7D74E', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Battlefield 2042', N'header3.jpg', N'849000', N'18', N'["ss_654f59aa78b9a2c6192a3a63b752eff6c1b78d48.1920x1080.jpg","ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg","ss_72cb10fb8f0c7554e932257450b19189534a846d.1920x1080.jpg","ss_08b2e18dbb11333791d35fed9338a6e6eedd923a.1920x1080.jpg","ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg"]', N'Chiến đấu trong một thế giới tương lai với các trận chiến quy mô lớn và chiến thuật đa dạng.', N'8192', N'32768', N'2023-01-01', N'2024-08-17', N'1.0', N'0', N'Songoku 7/GAME-SONGOKU-7.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'6652385C-F022-4575-B59F-AB714D2DE07A', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Final Fantasy XV', N'header_alt_assets_0.jpg', N'679000', N'18', N'["ss_90f5785f89a9882a7f33fd5a812a7e7384720afd.1920x1080.jpg","ss_e0b90753a55e638cac98b6b7b4f4c44b5242ceed.1920x1080.jpg","ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg","ss_1702e9bc7ba4ce2dce2555c8d63612aafb5c757a.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg"]', N'Khám phá thế giới tuyệt đẹp của Eos cùng với Noctis và nhóm bạn trong cuộc phiêu lưu kỳ diệu.', N'8192', N'32768', N'2023-05-01', N'2024-08-17', N'1.0', N'0', N'Songoku 8/GAME-SONGOKU-8.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'61DB0A0F-CB4D-47B6-8547-B87BAFFDCFC7', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Mortal Kombat 11', N'header_alt_assets_11.jpg', N'749000', N'18', N'["ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_f6f995f4dab00ab33dae1b7a0c05cc0ab8e7d62e.1920x1080.jpg","ss_e0b90753a55e638cac98b6b7b4f4c44b5242ceed.1920x1080.jpg","ss_23da24c6bfb4ef8af767aee077d0cc146892153a.1920x1080.jpg","ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg"]', N'Tham gia vào các trận chiến đối kháng đẫm máu với các nhân vật nổi tiếng và các chiêu thức đặc biệt trong phần mới nhất của Mortal Kombat.', N'8192', N'16384', N'2020-10-01', N'2024-08-17', N'1.0', N'0', N'Songoku 9/GAME-SONGOKU-9.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'3D99DBFC-E9E3-46F3-8469-B9F9DA09ED4A', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Mortal Kombat 11', N'header (1).jpg', N'749000', N'18', N'["ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg","ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_e0b90753a55e638cac98b6b7b4f4c44b5242ceed.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg"]', N'Tham gia vào các trận chiến đối kháng đẫm máu với các nhân vật nổi tiếng và các chiêu thức đặc biệt.', N'8192', N'16384', N'2023-07-01', N'2024-08-17', N'1.0', N'0', N'Songoku 10/GAME-SONGOKU-10.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'0F5A1493-9347-40BD-B2A5-BB36025BAF40', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Assassin Creed Odyssey', N'header (10).jpg', N'949000', N'18', N'["ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_08b2e18dbb11333791d35fed9338a6e6eedd923a.1920x1080.jpg","ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg","ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg"]', N'Trở thành huyền thoại trong thời đại của Hy Lạp cổ đại.', N'8192', N'32768', N'2023-08-01', N'2024-08-17', N'1.0', N'0', N'Songoku 11/GAME-SONGOKU-11.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'FF3C5E4C-27DD-4DBA-BBE8-C0AC5A3D4ECD', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'NBA 2K23', N'header (11).jpg', N'699000', N'12', N'["ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg"]', N'Trải nghiệm một mùa giải bóng rổ đỉnh cao với đồ họa chân thực và các chế độ chơi đa dạng trong NBA 2K23.', N'8192', N'32768', N'2021-07-01', N'2024-08-17', N'1.0', N'0', N'Songoku 12/GAME-SONGOKU-12.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'3C8F3F91-3FDF-4E41-BE3E-C56B08B75231', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Fire Emblem: Three Houses', N'header (12).jpg', N'849000', N'12', N'["ss_23da24c6bfb4ef8af767aee077d0cc146892153a.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_6416651523d0158b6fefd982d4f3e88876812227.1920x1080.jpg","ss_72cb10fb8f0c7554e932257450b19189534a846d.1920x1080.jpg","ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg","ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg"]', N'Trở thành một chiến lược gia và chỉ huy quân đội trong một thế giới nơi rồng và phép thuật là một phần của cuộc chiến.', N'8192', N'16384', N'2020-03-01', N'2024-08-17', N'1.0', N'0', N'Songoku 13/GAME-SONGOKU-13.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'582EAFB9-3B03-41A6-B138-C645628AEAC2', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'FIFA 24', N'header (2).jpg', N'699000', N'3', N'["ss_80d442d735c80a31c78696aeaaae08c0bf843a0f.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_6416651523d0158b6fefd982d4f3e88876812227.1920x1080.jpg","ss_72cb10fb8f0c7554e932257450b19189534a846d.1920x1080.jpg"]', N'Chơi bóng đá với các đội hình và cầu thủ mới nhất, trải nghiệm các chế độ chơi phong phú và đồ họa chân thực.', N'8192', N'32768', N'2023-09-01', N'2024-08-17', N'1.0', N'0', N'Songoku 1/GAME-SONGOKU-1.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'549522B9-3A21-4815-B0DF-C7D0C5106D55', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Far Cry 5', N'header (3).jpg', N'699000', N'18', N'["ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_119e7890b990201c6ca61280a76851dc0ced05f9.1920x1080.jpg","ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_e0b90753a55e638cac98b6b7b4f4c44b5242ceed.1920x1080.jpg","ss_23da24c6bfb4ef8af767aee077d0cc146892153a.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg"]', N'Khám phá Montana bị chiếm đóng bởi một giáo phái tôn thờ và tham gia vào cuộc chiến chống lại các thế lực cực đoan.', N'8192', N'32768', N'2023-03-01', N'2024-08-17', N'1.0', N'0', N'Songoku 2/GAME-SONGOKU-2.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'4066129D-B9D1-424C-BC69-CE456072D92F', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Life is Strange: True Colors', N'header (4).jpg', N'749000', N'18', N'["ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg","ss_23da24c6bfb4ef8af767aee077d0cc146892153a.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg","ss_119e7890b990201c6ca61280a76851dc0ced05f9.1920x1080.jpg","ss_f4ec953421c54bf74bdca77ceed361ad7b509858.1920x1080.jpg"]', N'Nhập vai vào một người trẻ với khả năng đọc tâm trí và khám phá một câu chuyện sâu lắng trong một thị trấn nhỏ đầy bí ẩn.', N'8192', N'32768', N'2022-04-01', N'2024-08-17', N'1.0', N'0', N'Songoku 3/GAME-SONGOKU-3.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'FA70A802-7D91-4661-8BDC-D35AD37B5321', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Assassin Creed Origins', N'header (5).jpg', N'899000', N'18', N'["ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg"]', N'Khám phá Ai Cập cổ đại và nguồn gốc của hội sát thủ.', N'8192', N'32768', N'2023-07-01', N'2024-08-17', N'1.0', N'0', N'Songoku 4/GAME-SONGOKU-4.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'921CF8D4-B8F2-49F8-9470-D3A40E312E4B', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Forza Horizon 5', N'header (6).jpg', N'799000', N'3', N'["ss_f6f995f4dab00ab33dae1b7a0c05cc0ab8e7d62e.1920x1080.jpg","ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_f35cedc28ae53c2cbafeb03177e3a4d416a00868.1920x1080.jpg","ss_23da24c6bfb4ef8af767aee077d0cc146892153a.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg"]', N'Khám phá các vùng đất rộng lớn và tham gia vào các cuộc đua không giới hạn trong môi trường Mexico sống động.', N'8192', N'32768', N'2023-06-01', N'2024-08-17', N'1.0', N'0', N'Songoku 5/GAME-SONGOKU-5.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'9016FDFA-766A-4CAE-8C74-D5D49DEB901D', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Lost Ark', N'header (7).jpg', N'849000', N'18', N'["ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg","ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg"]', N'Khám phá một thế giới rộng lớn với các trận chiến hành động và khám phá các bí ẩn về rồng và ma thuật.', N'8192', N'32768', N'2020-10-01', N'2024-08-17', N'1.0', N'0', N'Songoku 6/GAME-SONGOKU-6.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'815C0A61-AD8B-41AE-8EE1-DA09003FA9F3', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Assassin Creed Syndicate', N'header (8).jpg', N'789000', N'18', N'["ss_80d442d735c80a31c78696aeaaae08c0bf843a0f.1920x1080.jpg","ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_f4ec953421c54bf74bdca77ceed361ad7b509858.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_654f59aa78b9a2c6192a3a63b752eff6c1b78d48.1920x1080.jpg"]', N'Tham gia vào cuộc cách mạng công nghiệp tại London với cặp đôi sát thủ.', N'8192', N'32768', N'2023-06-01', N'2024-08-17', N'1.0', N'0', N'Songoku 7/GAME-SONGOKU-7.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'C4D5B242-211A-4A16-90C2-DA327BD9A789', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Assassin Creed 4 Black Flag', N'header (9).jpg', N'679000', N'18', N'["ss_08b2e18dbb11333791d35fed9338a6e6eedd923a.1920x1080.jpg","ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg","ss_6416651523d0158b6fefd982d4f3e88876812227.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg","ss_3f18dbe6561ea68c5acb055e3eaa97f480022c24.1920x1080.jpg","ss_72cb10fb8f0c7554e932257450b19189534a846d.1920x1080.jpg"]', N'Đắm chìm trong cuộc sống của một hải tặc trong thời đại vàng của cướp biển.', N'4096', N'20480', N'2023-04-01', N'2024-08-17', N'1.0', N'0', N'Songoku 8/GAME-SONGOKU-8.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'5D0B4F91-C949-40B4-B87A-DC5733B1ECA7', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Assassin Creed Mirage', N'header.jpg', N'789000', N'18', N'["ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_08b2e18dbb11333791d35fed9338a6e6eedd923a.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg"]', N'Khám phá những bí ẩn và âm mưu trong thành phố của những ngôi đền thiêng.', N'8192', N'32768', N'2023-10-01', N'2024-08-17', N'1.0', N'0', N'Songoku 9/GAME-SONGOKU-9.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'100763FA-FA2E-4FC7-A4B9-E6001084938D', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Age of Empires IV', N'header3.jpg', N'799000', N'12', N'["ss_72cb10fb8f0c7554e932257450b19189534a846d.1920x1080.jpg","ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg","ss_51db7d9662052c2a6adac07234469780437620a4.1920x1080.jpg","ss_8cc0dee7b6d6a4ece1f00a1a8fdedfc8d12a3cb6.1920x1080.jpg","ss_6416651523d0158b6fefd982d4f3e88876812227.1920x1080.jpg","ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg"]', N'Khám phá các chiến lược và chiến thuật trong thời kỳ trung cổ với đồ họa đẹp mắt và gameplay phong phú.', N'8192', N'32768', N'2023-09-01', N'2024-08-17', N'1.0', N'0', N'Songoku 10/GAME-SONGOKU-10.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'DCDE5F50-A2C6-461E-AD78-E6E424B59B75', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Bloodborne', N'header_alt_assets_0.jpg', N'729000', N'18', N'["ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg","ss_90f5785f89a9882a7f33fd5a812a7e7384720afd.1920x1080.jpg","ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg","ss_1702e9bc7ba4ce2dce2555c8d63612aafb5c757a.1920x1080.jpg","ss_7e67328c91605dca4f905d66b8259c3c2a6450d0.1920x1080.jpg","ss_654f59aa78b9a2c6192a3a63b752eff6c1b78d48.1920x1080.jpg"]', N'Khám phá thành phố gothic đầy ám ảnh và đấu tranh với các sinh vật khủng khiếp trong cuộc hành trình đẫm máu.', N'8192', N'16384', N'2023-07-01', N'2024-08-17', N'1.0', N'0', N'Songoku 11/GAME-SONGOKU-11.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'574A90C4-CBB6-4C2F-A386-E7E2414B1779', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Hitman 3', N'header_alt_assets_11.jpg', N'799000', N'18', N'["ss_c1701379f00439e2299ba6300b9c2b79f9cc6b6e.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg","ss_51db7d9662052c2a6adac07234469780437620a4.1920x1080.jpg","ss_119e7890b990201c6ca61280a76851dc0ced05f9.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg"]', N'Nhập vai vào sát thủ chuyên nghiệp và thực hiện các nhiệm vụ toàn cầu với các phương pháp tiếp cận khác nhau.', N'8192', N'32768', N'2022-07-01', N'2024-08-17', N'1.0', N'0', N'Songoku 12/GAME-SONGOKU-12.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'7CF43580-7BE2-4970-B7ED-E8F990CF8626', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Dragons Dogma', N'header (1).jpg', N'799000', N'18', N'["ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg","ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_04e44a1a23446c5ab3fa2a32320ae7abde77ff6a.1920x1080.jpg","ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg","ss_8cc0dee7b6d6a4ece1f00a1a8fdedfc8d12a3cb6.1920x1080.jpg","ss_f4ec953421c54bf74bdca77ceed361ad7b509858.1920x1080.jpg"]', N'Tham gia vào một cuộc phiêu lưu trong một thế giới mở với những trận chiến căng thẳng và các sinh vật huyền bí.', N'8192', N'32768', N'2021-05-01', N'2024-08-17', N'1.0', N'0', N'Songoku 13/GAME-SONGOKU-13.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'D8741898-E954-442B-B3C6-EC71AA7B0A18', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Watch Dogs: Legion', N'header (10).jpg', N'749000', N'18', N'["ss_51db7d9662052c2a6adac07234469780437620a4.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg","ss_e0b90753a55e638cac98b6b7b4f4c44b5242ceed.1920x1080.jpg","ss_23da24c6bfb4ef8af767aee077d0cc146892153a.1920x1080.jpg","ss_6416651523d0158b6fefd982d4f3e88876812227.1920x1080.jpg","ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg"]', N'Tham gia vào một thế giới mở tại London và chiến đấu để giải phóng thành phố khỏi sự kiểm soát của các thế lực độc tài.', N'8192', N'32768', N'2023-04-01', N'2024-08-17', N'1.0', N'0', N'Songoku 1/GAME-SONGOKU-1.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'C7B32539-2808-4967-B7CC-EE464E8FD7A8', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Assassin Creed 3', N'header (11).jpg', N'599000', N'18', N'["ss_1702e9bc7ba4ce2dce2555c8d63612aafb5c757a.1920x1080.jpg","ss_80d442d735c80a31c78696aeaaae08c0bf843a0f.1920x1080.jpg","ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_72cb10fb8f0c7554e932257450b19189534a846d.1920x1080.jpg","ss_51db7d9662052c2a6adac07234469780437620a4.1920x1080.jpg"]', N'Tham gia vào cuộc chiến giành độc lập của Hoa Kỳ trong vai trò của một sát thủ huyền thoại.', N'4096', N'20480', N'2023-01-01', N'2024-08-17', N'1.0', N'0', N'Songoku 2/GAME-SONGOKU-2.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'8B321501-2737-4C82-A1D1-F3E29BEDAEA7', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Far Cry 6', N'header (12).jpg', N'849000', N'18', N'["ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg","ss_e0b90753a55e638cac98b6b7b4f4c44b5242ceed.1920x1080.jpg","ss_745dcdcaf10dca3a767aaa68fe6db2ec3521284e.1920x1080.jpg","ss_90f5785f89a9882a7f33fd5a812a7e7384720afd.1920x1080.jpg","ss_bfda57d08727dd5281892e13b594121b897ea407.1920x1080.jpg","ss_23da24c6bfb4ef8af767aee077d0cc146892153a.1920x1080.jpg"]', N'Khám phá một hòn đảo nhiệt đới và tham gia vào cuộc chiến chống lại chế độ độc tài trong một thế giới mở đầy phong phú.', N'8192', N'32768', N'2023-08-01', N'2024-08-17', N'1.0', N'0', N'Songoku 3/GAME-SONGOKU-3.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'DBED75A4-A684-440A-ADA6-F69D2352BE20', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Red Dead Redemption 2', N'header (2).jpg', N'899000', N'18', N'["ss_ce878729bacf2a48a180d294ee17686633d7e017.1920x1080.jpg","ss_edf6973923cb0d2ad72acecc014262a6de55a608.1920x1080.jpg","ss_654f59aa78b9a2c6192a3a63b752eff6c1b78d48.1920x1080.jpg","ss_3d48baf2e7aaf087afbab1c4268637df528eb2c8.1920x1080.jpg","ss_239163189583f7f94812f8bef9298e1b2e668160.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg"]', N'Trải nghiệm cuộc sống của một tên cướp ở miền Tây hoang dã trong thế giới mở phong phú.', N'8192', N'32768', N'2023-03-01', N'2024-08-17', N'1.0', N'0', N'Songoku 4/GAME-SONGOKU-4.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'E4533974-E248-49FB-AF27-F7467C85FA0C', N'CE097B0F-9C9B-4617-9128-4F469CB99D03', N'Assassin Creed Revelations', N'header (3).jpg', N'589000', N'18', N'["ss_98935e58c3a3fcbe51b09c64cf2945427132ff2d.1920x1080.jpg","ss_f4ec953421c54bf74bdca77ceed361ad7b509858.1920x1080.jpg","ss_51db7d9662052c2a6adac07234469780437620a4.1920x1080.jpg","ss_72cb10fb8f0c7554e932257450b19189534a846d.1920x1080.jpg","ss_6c52d64bbe47755ed6a47316935676cf29b25118.1920x1080.jpg","ss_7c70bc3bdba8adca87c229ed1a2ad15a36ec2573.1920x1080.jpg"]', N'Theo chân Ezio Auditore trong hành trình tìm kiếm sự thật ẩn sau Assassin Order.', N'4096', N'20480', N'2023-03-01', N'2024-08-17', N'1.0', N'0', N'Songoku 5/GAME-SONGOKU-5.exe')
GO

INSERT INTO [dbo].[GAME] ([id], [publisher_id], [name], [avatar], [gia_tien], [age], [images], [mo_ta], [ram], [rom], [release_date], [update_date], [version], [isOpened], [exec_file]) VALUES (N'4C75B9EA-78DD-4EB1-8C4F-FE84AAF1E0E7', N'BDAB86F9-AC5A-4CE8-9AF5-5DD9299057DE', N'Borderlands 3', N'header (4).jpg', N'679000', N'18', N'["ss_51db7d9662052c2a6adac07234469780437620a4.1920x1080.jpg","ss_6389b6aef0ecaa3f6cc1e36dcfb145c6fcb70a75.1920x1080.jpg","ss_bcced8fb8be5b0ba2ec2495ae73c6827ccd611e8.1920x1080.jpg","ss_0f3e7a47e3cfa98f6db6ded45df4ce010200e4d0.1920x1080.jpg","ss_08b2e18dbb11333791d35fed9338a6e6eedd923a.1920x1080.jpg","ss_8cc0dee7b6d6a4ece1f00a1a8fdedfc8d12a3cb6.1920x1080.jpg"]', N'Khám phá thế giới mở của Pandora với các nhân vật kỳ quặc và vũ khí độc đáo trong cuộc phiêu lưu bắn súng góc nhìn thứ nhất.', N'8192', N'16384', N'2023-07-01', N'2024-08-17', N'1.0', N'0', N'Songoku 6/GAME-SONGOKU-6.exe')
GO


-- ----------------------------
-- Table structure for NAP_CHUYEN_KHOAN
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[NAP_CHUYEN_KHOAN]') AND type IN ('U'))
	DROP TABLE [dbo].[NAP_CHUYEN_KHOAN]
GO

CREATE TABLE [dbo].[NAP_CHUYEN_KHOAN] (
  [phieu_nap_id] uniqueidentifier  NOT NULL,
  [hinh_thuc] smallint  NULL
)
GO

ALTER TABLE [dbo].[NAP_CHUYEN_KHOAN] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of NAP_CHUYEN_KHOAN
-- ----------------------------

-- ----------------------------
-- Table structure for PENDING_GAMES
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[PENDING_GAMES]') AND type IN ('U'))
	DROP TABLE [dbo].[PENDING_GAMES]
GO

CREATE TABLE [dbo].[PENDING_GAMES] (
  [review_id] uniqueidentifier  NOT NULL,
  [game_id] uniqueidentifier  NOT NULL,
  [game_name] nvarchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [avatar] nvarchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [gia_tien] float(53)  NOT NULL,
  [age] smallint  NOT NULL,
  [images] varchar(max) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [mo_ta] nvarchar(max) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [ram] int  NOT NULL,
  [rom] int  NOT NULL,
  [version] nvarchar(30) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [exec_file] nvarchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [imageToDelete] nvarchar(max) COLLATE SQL_Latin1_General_CP1_CI_AS DEFAULT '[]' NULL
)
GO

ALTER TABLE [dbo].[PENDING_GAMES] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of PENDING_GAMES
-- ----------------------------

-- ----------------------------
-- Table structure for PHIEU_KIEM_DUYET
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[PHIEU_KIEM_DUYET]') AND type IN ('U'))
	DROP TABLE [dbo].[PHIEU_KIEM_DUYET]
GO

CREATE TABLE [dbo].[PHIEU_KIEM_DUYET] (
  [id] uniqueidentifier  NOT NULL,
  [publisher_id] uniqueidentifier  NOT NULL,
  [mo_ta] nvarchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL,
  [trang_thai] smallint  NOT NULL,
  [thong_bao] nvarchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [ngay_tao] date DEFAULT getdate() NULL
)
GO

ALTER TABLE [dbo].[PHIEU_KIEM_DUYET] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of PHIEU_KIEM_DUYET
-- ----------------------------

-- ----------------------------
-- Table structure for PHIEU_NAP
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[PHIEU_NAP]') AND type IN ('U'))
	DROP TABLE [dbo].[PHIEU_NAP]
GO

CREATE TABLE [dbo].[PHIEU_NAP] (
  [id] uniqueidentifier  NOT NULL,
  [account_id] uniqueidentifier  NOT NULL,
  [method] smallint  NOT NULL,
  [ngay_nap] datetime DEFAULT getdate() NULL,
  [trang_thai] smallint  NOT NULL,
  [so_tien] money  NULL
)
GO

ALTER TABLE [dbo].[PHIEU_NAP] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of PHIEU_NAP
-- ----------------------------

-- ----------------------------
-- Table structure for PHIEU_RUT_TIEN
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[PHIEU_RUT_TIEN]') AND type IN ('U'))
	DROP TABLE [dbo].[PHIEU_RUT_TIEN]
GO

CREATE TABLE [dbo].[PHIEU_RUT_TIEN] (
  [id] uniqueidentifier  NOT NULL,
  [account_id] uniqueidentifier  NOT NULL,
  [so_tien_rut] float(53)  NOT NULL,
  [method] smallint  NOT NULL,
  [ngay_rut] date DEFAULT getdate() NULL,
  [trang_thai] smallint  NOT NULL
)
GO

ALTER TABLE [dbo].[PHIEU_RUT_TIEN] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of PHIEU_RUT_TIEN
-- ----------------------------

-- ----------------------------
-- Table structure for RUT_TIEN_NGAN_HANG
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[RUT_TIEN_NGAN_HANG]') AND type IN ('U'))
	DROP TABLE [dbo].[RUT_TIEN_NGAN_HANG]
GO

CREATE TABLE [dbo].[RUT_TIEN_NGAN_HANG] (
  [phieu_rut_id] uniqueidentifier  NOT NULL,
  [bank_id] int  NOT NULL,
  [so_tai_khoan] varchar(20) COLLATE SQL_Latin1_General_CP1_CI_AS  NOT NULL
)
GO

ALTER TABLE [dbo].[RUT_TIEN_NGAN_HANG] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of RUT_TIEN_NGAN_HANG
-- ----------------------------

-- ----------------------------
-- Table structure for THU_VIEN_GAME
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[THU_VIEN_GAME]') AND type IN ('U'))
	DROP TABLE [dbo].[THU_VIEN_GAME]
GO

CREATE TABLE [dbo].[THU_VIEN_GAME] (
  [account_id] uniqueidentifier  NOT NULL,
  [game_id] uniqueidentifier  NOT NULL,
  [gia_mua] money  NOT NULL,
  [ngay_mua] date  NOT NULL,
  [rate] int  NULL,
  [comment] nvarchar(max) COLLATE SQL_Latin1_General_CP1_CI_AS DEFAULT '' NULL
)
GO

ALTER TABLE [dbo].[THU_VIEN_GAME] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of THU_VIEN_GAME
-- ----------------------------

-- ----------------------------
-- procedure structure for REGISTER
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[REGISTER]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[REGISTER]
GO

CREATE PROCEDURE [dbo].[REGISTER]
    @id UNIQUEIDENTIFIER,
    @username VARCHAR(32),
    @password VARCHAR(255),
    @ho_ten NVARCHAR(100),
    @email VARCHAR(255),
    @gioitinh TINYINT,
    @dob DATE
AS
BEGIN
    INSERT INTO ACCOUNT(id,username,password,ho_ten,email,gioi_tinh,dob,isBan,isAdmin)
    VALUES(@id,@username,@password,@ho_ten,@email,@gioitinh,@dob,0,0)
END
GO


-- ----------------------------
-- procedure structure for SP_ACCEPT_GAME
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_ACCEPT_GAME]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_ACCEPT_GAME]
GO

CREATE PROCEDURE [dbo].[SP_ACCEPT_GAME] @phieu_kiem_duyet_id UNIQUEIDENTIFIER
AS
BEGIN TRY
    BEGIN TRANSACTION
        UPDATE PHIEU_KIEM_DUYET
        SET trang_thai = 1
        WHERE id = @phieu_kiem_duyet_id;
        IF (SELECT id FROM GAME WHERE id = (SELECT game_id FROM PENDING_GAMES WHERE review_id = @phieu_kiem_duyet_id)) IS NULL
            BEGIN
                INSERT INTO GAME(id, publisher_id, name, avatar, gia_tien, age, images, mo_ta, ram, rom, version, exec_file)
                SELECT game_id, publisher_id, game_name, avatar, gia_tien, age, images, PG.mo_ta, ram, rom, version, exec_file
                FROM PENDING_GAMES PG
                         INNER JOIN PHIEU_KIEM_DUYET PKD ON review_id = PKD.id
                WHERE review_id = @phieu_kiem_duyet_id
            END
        ELSE
            BEGIN
                UPDATE GAME
                SET name        = game_name,
                    avatar      = PG.avatar,
                    gia_tien    = PG.gia_tien,
                    age         = PG.age,
                    images      = PG.images,
                    mo_ta       = PG.mo_ta,
                    ram         = PG.ram,
                    rom         = PG.rom,
                    version     = PG.version,
                    update_date = GETDATE(),
                    exec_file   = PG.exec_file
                FROM PENDING_GAMES PG
                WHERE id = PG.game_id
                  AND PG.review_id = @phieu_kiem_duyet_id
            END
    COMMIT TRANSACTION
END TRY
begin catch
    ROLLBACK TRANSACTION
end catch
GO


-- ----------------------------
-- procedure structure for SP_DELETE_EVALUATION
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_DELETE_EVALUATION]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_DELETE_EVALUATION]
GO

CREATE PROCEDURE [dbo].[SP_DELETE_EVALUATION]
    @game_id UNIQUEIDENTIFIER,
    @account_id UNIQUEIDENTIFIER
AS
BEGIN TRY
    BEGIN TRANSACTION
        UPDATE THU_VIEN_GAME
        SET comment = NULL
        WHERE game_id = @game_id and account_id = @account_id
    COMMIT TRANSACTION
end try
begin catch
    rollback transaction
end catch
GO


-- ----------------------------
-- procedure structure for SP_DUYET_PHIEU_NAP
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_DUYET_PHIEU_NAP]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_DUYET_PHIEU_NAP]
GO

CREATE PROCEDURE [dbo].[SP_DUYET_PHIEU_NAP]
    @id UNIQUEIDENTIFIER,
    @account_id UNIQUEIDENTIFIER,
    @so_tien money,
    @method smallint,
    @trang_thai smallint
as
    BEGIN TRANSACTION
BEGIN TRY
    UPDATE PHIEU_NAP SET trang_thai = @trang_thai WHERE id = @id
    UPDATE ACCOUNT SET so_du_game = so_du_game + @so_tien WHERE id = @account_id
    COMMIT TRANSACTION
end try
begin catch
    ROLLBACK TRANSACTION
end catch
GO


-- ----------------------------
-- procedure structure for SP_EVALUATE
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_EVALUATE]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_EVALUATE]
GO

CREATE PROCEDURE [dbo].[SP_EVALUATE]
    @game_id UNIQUEIDENTIFIER,
    @account_id UNIQUEIDENTIFIER,
    @rate INT,
    @comment NVARCHAR(MAX)
AS
BEGIN TRY
    BEGIN TRANSACTION
        UPDATE THU_VIEN_GAME
        SET rate = @rate, comment = @comment
        WHERE game_id = @game_id and account_id = @account_id
    COMMIT TRANSACTION
end try
begin catch
    rollback transaction
end catch
GO


-- ----------------------------
-- procedure structure for SP_GET_DISPLAY_GAMES
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_GET_DISPLAY_GAMES]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_GET_DISPLAY_GAMES]
GO

CREATE PROCEDURE [dbo].[SP_GET_DISPLAY_GAMES]
@tuoi INT
AS
BEGIN
    SELECT G.id, publisher_id, name, G.avatar, gia_tien, age, images, mo_ta,
           ram, rom, release_date, update_date, version, isOpened, exec_file,
           A.ho_ten, COUNT(TVG.game_id) AS download_count, ISNULL(AVG(TVG.rate),0) AS rate
    FROM GAME G INNER JOIN ACCOUNT A on A.id = G.publisher_id
                LEFT JOIN THU_VIEN_GAME TVG ON G.id = TVG.game_id
    WHERE isOpened = 1 AND age <= @tuoi
    GROUP BY G.id, publisher_id, name, G.avatar, gia_tien, age, images, mo_ta,
             ram, rom, release_date, update_date, version, isOpened, exec_file, A.ho_ten
    ORDER BY ISNULL(COUNT(TVG.game_id),0) DESC, ISNULL(AVG(TVG.rate),0) DESC, release_date DESC
END
GO


-- ----------------------------
-- procedure structure for SP_GET_EVALUATION
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_GET_EVALUATION]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_GET_EVALUATION]
GO

CREATE PROCEDURE [dbo].[SP_GET_EVALUATION]
@game_id UNIQUEIDENTIFIER
AS
BEGIN
    SELECT account_id, ho_ten, avatar, rate, comment
    FROM THU_VIEN_GAME INNER JOIN dbo.ACCOUNT A on A.id = THU_VIEN_GAME.account_id
    WHERE game_id = @game_id AND (comment IS NOT NULL AND comment <> '')
END
GO


-- ----------------------------
-- procedure structure for SP_GET_MAP_LIBRARY
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_GET_MAP_LIBRARY]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_GET_MAP_LIBRARY]
GO

CREATE PROCEDURE [dbo].[SP_GET_MAP_LIBRARY]
@account_id UNIQUEIDENTIFIER
as
SELECT game_id, gia_mua, ngay_mua, avatar, name, version, exec_file
FROM THU_VIEN_GAME TVG INNER JOIN dbo.GAME G on G.id = TVG.game_id
WHERE account_id = @account_id
GO


-- ----------------------------
-- procedure structure for SP_LAY_GAME_ORDER_BY_LUOT_TAI
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_LAY_GAME_ORDER_BY_LUOT_TAI]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_LAY_GAME_ORDER_BY_LUOT_TAI]
GO

CREATE PROCEDURE [dbo].[SP_LAY_GAME_ORDER_BY_LUOT_TAI]
AS
SELECT game_id, COUNT(*) as luot_tai
FROM THU_VIEN_GAME
         INNER JOIN GAME G on THU_VIEN_GAME.game_id = G.id
WHERE isOpened = 1
GROUP BY game_id
ORDER BY luot_tai DESC
GO


-- ----------------------------
-- procedure structure for SP_LAY_GAME_TOP1
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_LAY_GAME_TOP1]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_LAY_GAME_TOP1]
GO

CREATE PROCEDURE [dbo].[SP_LAY_GAME_TOP1]
AS
DECLARE @game_id UNIQUEIDENTIFIER
SELECT TOP 1 @game_id = TVG.game_id
FROM THU_VIEN_GAME TVG inner join dbo.GAME G on G.id = TVG.game_id
WHERE isOpened = 1
GROUP BY TVG.game_id
ORDER BY COUNT(*) DESC, AVG(rate) DESC
    IF (@game_id IS NOT NULL)
        SELECT * FROM GAME WHERE id = @game_id
    ELSE
        SELECT TOP 1 * FROM GAME
GO


-- ----------------------------
-- procedure structure for SP_LAY_PHIEU_NAP
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_LAY_PHIEU_NAP]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_LAY_PHIEU_NAP]
GO

CREATE PROCEDURE [dbo].[SP_LAY_PHIEU_NAP]
AS
SELECT id,
       account_id,
       method,
       secret_key,
       seri,
       hinh_thuc,
       so_tien,
       ngay_nap,
       trang_thai
FROM PHIEU_NAP PN
         INNER JOIN CARD CR ON id = CR.phieu_nap_id
         INNER JOIN dbo.NAP_CHUYEN_KHOAN NCK on PN.id = NCK.phieu_nap_id
GO


-- ----------------------------
-- procedure structure for SP_LAY_PHIEU_NAP_BY_ID
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_LAY_PHIEU_NAP_BY_ID]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_LAY_PHIEU_NAP_BY_ID]
GO

CREATE PROCEDURE [dbo].[SP_LAY_PHIEU_NAP_BY_ID] @id UNIQUEIDENTIFIER,
                                                @method smallint
AS
    IF @method = 0
        SELECT id,
               account_id,
               secret_key,
               seri,
               nha_mang,
               method,
               ngay_nap,
               trang_thai,
               so_tien
        FROM PHIEU_NAP PN
                 INNER JOIN CARD C ON PN.id = C.phieu_nap_id
        WHERE id = @id
    ELSE
        SELECT id, account_id, method, hinh_thuc, ngay_nap, trang_thai, so_tien
        FROM PHIEU_NAP PN
                 INNER JOIN dbo.NAP_CHUYEN_KHOAN NCK on PN.id = NCK.phieu_nap_id
        WHERE id = @id
GO


-- ----------------------------
-- procedure structure for SP_LAY_TEN_NHA_PHAT_HANH
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_LAY_TEN_NHA_PHAT_HANH]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_LAY_TEN_NHA_PHAT_HANH]
GO

CREATE PROCEDURE [dbo].[SP_LAY_TEN_NHA_PHAT_HANH]
@game_id UNIQUEIDENTIFIER
as
SELECT ho_ten FROM GAME INNER JOIN dbo.ACCOUNT A on A.id = GAME.publisher_id WHERE GAME.id = @game_id
GO


-- ----------------------------
-- procedure structure for SP_LAY_THONG_TIN_NAP
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_LAY_THONG_TIN_NAP]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_LAY_THONG_TIN_NAP]
GO

CREATE PROCEDURE [dbo].[SP_LAY_THONG_TIN_NAP]
@method SMALLINT
AS
BEGIN
    IF(@method = 0)
        SELECT id, account_id, method, ngay_nap, trang_thai, so_tien,secret_key,seri,nha_mang from PHIEU_NAP
                                                                                                       INNER JOIN CARD on PHIEU_NAP.id = CARD.phieu_nap_id
        WHERE method = @method
        ORDER BY ngay_nap DESC
    ELSE
        SELECT id, account_id, method, ngay_nap, trang_thai, so_tien, hinh_thuc FROM PHIEU_NAP
                                                                                         INNER JOIN NAP_CHUYEN_KHOAN on PHIEU_NAP.id = NAP_CHUYEN_KHOAN.phieu_nap_id
        WHERE method = @method
        ORDER BY ngay_nap DESC
END
GO


-- ----------------------------
-- procedure structure for SP_LAY_THONG_TIN_NAP_BY_ACCOUNT_ID
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_LAY_THONG_TIN_NAP_BY_ACCOUNT_ID]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_LAY_THONG_TIN_NAP_BY_ACCOUNT_ID]
GO

CREATE PROCEDURE [dbo].[SP_LAY_THONG_TIN_NAP_BY_ACCOUNT_ID]
    @account_id UNIQUEIDENTIFIER,
    @method SMALLINT
AS
BEGIN
    IF(@method = 0)
        SELECT id, account_id, method, ngay_nap, trang_thai, so_tien,secret_key,seri,nha_mang from PHIEU_NAP
                                                                                                       INNER JOIN CARD on PHIEU_NAP.id = CARD.phieu_nap_id
        WHERE account_id = @account_id AND method = @method
        ORDER BY ngay_nap DESC
    ELSE
        SELECT id, account_id, method, ngay_nap, trang_thai, so_tien, hinh_thuc FROM PHIEU_NAP
                                                                                         INNER JOIN NAP_CHUYEN_KHOAN on PHIEU_NAP.id = NAP_CHUYEN_KHOAN.phieu_nap_id
        WHERE account_id = @account_id AND method = @method
        ORDER BY ngay_nap DESC
END
GO


-- ----------------------------
-- procedure structure for SP_LAY_THONG_TIN_NAP_TIEN_BY_FILTER
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_LAY_THONG_TIN_NAP_TIEN_BY_FILTER]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_LAY_THONG_TIN_NAP_TIEN_BY_FILTER]
GO

CREATE PROCEDURE [dbo].[SP_LAY_THONG_TIN_NAP_TIEN_BY_FILTER]
    @month SMALLINT,
    @year SMALLINT,
    @status SMALLINT
AS
SELECT PHIEU_NAP.id as id, account_id, so_tien, method, ngay_nap, trang_thai, hinh_thuc, secret_key, seri, nha_mang
FROM PHIEU_NAP INNER JOIN ACCOUNT A on A.id = PHIEU_NAP.account_id
               LEFT JOIN CARD on PHIEU_NAP.id = CARD.phieu_nap_id
               LEFT JOIN NAP_CHUYEN_KHOAN on PHIEU_NAP.id = NAP_CHUYEN_KHOAN.phieu_nap_id
WHERE MONTH(ngay_nap) = @month AND YEAR(ngay_nap) = @year AND trang_thai = @status
ORDER BY ngay_nap DESC, so_tien DESC
GO


-- ----------------------------
-- procedure structure for SP_LAY_THONG_TIN_RUT_TIEN_BY_FILTER
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_LAY_THONG_TIN_RUT_TIEN_BY_FILTER]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_LAY_THONG_TIN_RUT_TIEN_BY_FILTER]
GO

CREATE PROCEDURE [dbo].[SP_LAY_THONG_TIN_RUT_TIEN_BY_FILTER]
    @month SMALLINT,
    @year SMALLINT,
    @status SMALLINT
AS
BEGIN
    SELECT id, account_id, so_tien_rut, ngay_rut, trang_thai
    FROM PHIEU_RUT_TIEN
    WHERE DATEPART(month, ngay_rut) = @month AND DATEPART(year, ngay_rut) = @year AND trang_thai = @status
END
GO


-- ----------------------------
-- procedure structure for SP_LAY_TOP_GAME
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_LAY_TOP_GAME]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_LAY_TOP_GAME]
GO

CREATE PROCEDURE [dbo].[SP_LAY_TOP_GAME]
AS
SELECT TOP 10 game_id, COUNT(*) as luot_tai
FROM THU_VIEN_GAME
         INNER JOIN GAME G on THU_VIEN_GAME.game_id = G.id
WHERE isOpened = 1
GROUP BY game_id
ORDER BY luot_tai DESC
GO


-- ----------------------------
-- procedure structure for SP_LAY_TOP_GAME_CU
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_LAY_TOP_GAME_CU]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_LAY_TOP_GAME_CU]
GO

CREATE PROCEDURE [dbo].[SP_LAY_TOP_GAME_CU]
as
SELECT * FROM GAME ORDER BY release_date
GO


-- ----------------------------
-- procedure structure for SP_MUA_GAME
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_MUA_GAME]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_MUA_GAME]
GO

CREATE PROCEDURE [dbo].[SP_MUA_GAME]
    @account_id UNIQUEIDENTIFIER,
    @game_id UNIQUEIDENTIFIER
AS
BEGIN TRY
    BEGIN TRANSACTION
        DECLARE @so_du_hien_tai float
        SELECT @so_du_hien_tai = so_du_game FROM ACCOUNT WHERE id = @account_id
        DECLARE @so_tien_game float
        SELECT @so_tien_game = gia_tien FROM GAME WHERE id = @game_id
        DECLARE @publisher_id UNIQUEIDENTIFIER
        SELECT @publisher_id = publisher_id FROM GAME WHERE id = @game_id
        IF @so_du_hien_tai >= @so_tien_game
            BEGIN
                UPDATE ACCOUNT SET so_du_game = @so_du_hien_tai - @so_tien_game WHERE id = @account_id
                INSERT INTO THU_VIEN_GAME(account_id, game_id, gia_mua,ngay_mua) VALUES (@account_id, @game_id,@so_tien_game, GETDATE())
                UPDATE ACCOUNT SET so_du_kdoanh = so_du_kdoanh + (@so_tien_game * 0.7) WHERE id = @publisher_id
            END
    COMMIT TRANSACTION
end try
begin catch
    ROLLBACK TRANSACTION
end catch
GO


-- ----------------------------
-- procedure structure for SP_NAP_CARD
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_NAP_CARD]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_NAP_CARD]
GO

CREATE PROCEDURE [dbo].[SP_NAP_CARD] @id UNIQUEIDENTIFIER,
                                     @account_id UNIQUEIDENTIFIER,
                                     @secret_key VARCHAR(30),
                                     @seri VARCHAR(30),
                                     @so_tien money,
                                     @nha_mang INT
AS
    BEGIN TRANSACTION
BEGIN TRY
    INSERT INTO PHIEU_NAP(id, account_id, method, so_tien, trang_thai)
    VALUES (@id, @account_id, 0, @so_tien, 0)
    INSERT INTO CARD(phieu_nap_id, secret_key, nha_mang, seri)
    VALUES (@id, @secret_key, @nha_mang, @seri)
    COMMIT TRANSACTION
END TRY
BEGIN CATCH
    ROLLBACK TRANSACTION
end catch
GO


-- ----------------------------
-- procedure structure for SP_NAP_CK
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_NAP_CK]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_NAP_CK]
GO

CREATE PROCEDURE [dbo].[SP_NAP_CK] @id UNIQUEIDENTIFIER,
                                   @account_id UNIQUEIDENTIFIER,
                                   @so_tien_nap money,
                                   @hinh_thuc smallint
AS
    BEGIN TRANSACTION
BEGIN TRY
    INSERT INTO PHIEU_NAP(id, account_id, method, so_tien, trang_thai)
    VALUES (@id, @account_id, 1, @so_tien_nap, 0)
    INSERT INTO NAP_CHUYEN_KHOAN
    VALUES (@id, @hinh_thuc)
    COMMIT TRANSACTION
end try
begin catch
    ROLLBACK TRANSACTION
end catch
GO


-- ----------------------------
-- procedure structure for SP_REJECT_GAME
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_REJECT_GAME]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_REJECT_GAME]
GO

CREATE PROCEDURE [dbo].[SP_REJECT_GAME] @phieu_kiem_duyet_id UNIQUEIDENTIFIER,
                                        @ly_do NVARCHAR(255)
AS
    BEGIN TRANSACTION
BEGIN TRY
    UPDATE PHIEU_KIEM_DUYET
    SET trang_thai = 2,
        thong_bao  = @ly_do
    WHERE id = @phieu_kiem_duyet_id
    COMMIT TRANSACTION
END TRY
BEGIN CATCH
    ROLLBACK TRANSACTION
END CATCH
GO


-- ----------------------------
-- procedure structure for SP_TAO_PHIEU_KIEM_DUYET
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TAO_PHIEU_KIEM_DUYET]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TAO_PHIEU_KIEM_DUYET]
GO

CREATE PROCEDURE [dbo].[SP_TAO_PHIEU_KIEM_DUYET] @id UNIQUEIDENTIFIER,
                                                 @publisher_id UNIQUEIDENTIFIER,
                                                 @mo_ta NVARCHAR(255),
                                                 @thong_bao NVARCHAR(255),
                                                 @game_id UNIQUEIDENTIFIER,
                                                 @game_name NVARCHAR(255),
                                                 @avatar NVARCHAR(255),
                                                 @gia_tien money,
                                                 @age smallint,
                                                 @images NVARCHAR(MAX),
                                                 @mo_ta_game varchar(max),
                                                 @ram int,
                                                 @rom int,
                                                 @version NVARCHAR(30),
                                                 @exec_file NVARCHAR(255),
                                                 @imageToDelete NVARCHAR(MAX)
AS
BEGIN TRY
    BEGIN TRANSACTION
        INSERT INTO PHIEU_KIEM_DUYET(id, publisher_id, mo_ta, trang_thai, thong_bao)
        VALUES (@id, @publisher_id, @mo_ta, 0, @thong_bao)
        INSERT INTO PENDING_GAMES(review_id, game_id, game_name, avatar, gia_tien, age, images, mo_ta, ram, rom, version,
                                  exec_file, imageToDelete)
        VALUES (@id, @game_id, @game_name, @avatar, @gia_tien, @age, @images, @mo_ta_game, @ram, @rom, @version, @exec_file,
                @imageToDelete)
    COMMIT TRANSACTION
end try
begin catch
    ROLLBACK TRANSACTION
end catch
GO


-- ----------------------------
-- procedure structure for SP_TAO_RUT_TIEN_BANK
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TAO_RUT_TIEN_BANK]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TAO_RUT_TIEN_BANK]
GO

CREATE PROCEDURE [dbo].[SP_TAO_RUT_TIEN_BANK] @id UNIQUEIDENTIFIER,
                                              @account_id UNIQUEIDENTIFIER,
                                              @so_tien money,
                                              @bank_id int,
                                              @so_tai_khoan varchar(20)
AS
    BEGIN TRANSACTION
BEGIN TRY
    INSERT INTO PHIEU_RUT_TIEN(id, account_id, so_tien_rut, method, trang_thai)
    VALUES (@id, @account_id, @so_tien, 0, 0)
    INSERT INTO RUT_TIEN_NGAN_HANG
    VALUES (@id, @bank_id, @so_tai_khoan)
    UPDATE ACCOUNT SET so_du_kdoanh = so_du_kdoanh - @so_tien WHERE id = @account_id
    COMMIT TRANSACTION
END TRY
BEGIN CATCH
    ROLLBACK TRANSACTION
END CATCH
GO


-- ----------------------------
-- procedure structure for SP_TAO_RUT_TIEN_GAME
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TAO_RUT_TIEN_GAME]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TAO_RUT_TIEN_GAME]
GO

CREATE PROCEDURE [dbo].[SP_TAO_RUT_TIEN_GAME] @id UNIQUEIDENTIFIER,
                                              @account_id UNIQUEIDENTIFIER,
                                              @so_tien money
AS
    BEGIN TRANSACTION
BEGIN TRY
    INSERT INTO PHIEU_RUT_TIEN(id, account_id, so_tien_rut, method, trang_thai)
    VALUES (@id, @account_id, @so_tien, 1, 1)
    UPDATE ACCOUNT SET
                       so_du_kdoanh = so_du_kdoanh - @so_tien,
                       so_du_game = so_du_game + @so_tien
    WHERE id = @account_id
    COMMIT TRANSACTION
end try
begin catch
    ROLLBACK TRANSACTION
end catch
GO


-- ----------------------------
-- procedure structure for SP_THONG_KE_GAME_DOI_TAC
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_THONG_KE_GAME_DOI_TAC]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_THONG_KE_GAME_DOI_TAC]
GO

CREATE PROCEDURE [dbo].[SP_THONG_KE_GAME_DOI_TAC]
@publisher_id UNIQUEIDENTIFIER
AS
SELECT G.name,
       SUM(gia_mua) as total_revenue,
       COUNT(game_id) as total_download,
       SUM(IIF(MONTH(ngay_mua) = MONTH(GETDATE()) AND YEAR(ngay_mua) = YEAR(GETDATE()), gia_mua, 0)) as monthly_revenue
FROM THU_VIEN_GAME
         INNER JOIN GAME G on G.id = THU_VIEN_GAME.game_id
WHERE publisher_id = @publisher_id
GROUP BY publisher_id, G.name
GO


-- ----------------------------
-- procedure structure for SP_TIM_KIEM_GAME
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TIM_KIEM_GAME]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TIM_KIEM_GAME]
GO

CREATE PROCEDURE [dbo].[SP_TIM_KIEM_GAME]
    @search nvarchar(255),
    @age smallint
AS
SELECT G.id, publisher_id, name, G.avatar, gia_tien, age, images, mo_ta,
       ram, rom, release_date, update_date, version, isOpened, exec_file,
       A.ho_ten, COUNT(TVG.game_id) AS download_count, AVG(TVG.rate) AS rate
FROM GAME G INNER JOIN ACCOUNT A on A.id = G.publisher_id
            LEFT JOIN THU_VIEN_GAME TVG ON G.id = TVG.game_id
WHERE isOpened = 1 AND age <= @age AND (name LIKE '%' + @search + '%')
GROUP BY G.id, publisher_id, name, G.avatar, gia_tien, age, images, mo_ta,
         ram, rom, release_date, update_date, version, isOpened, exec_file, A.ho_ten
ORDER BY COUNT(TVG.game_id) DESC, AVG(TVG.rate) DESC, release_date DESC, update_date DESC
GO


-- ----------------------------
-- procedure structure for SP_TINH_DIEM_DANH_GIA
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TINH_DIEM_DANH_GIA]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TINH_DIEM_DANH_GIA]
GO

CREATE PROCEDURE [dbo].[SP_TINH_DIEM_DANH_GIA] @game_id UNIQUEIDENTIFIER
AS
SELECT AVG(rate) as diem_tb
FROM THU_VIEN_GAME
WHERE game_id = @game_id
GO


-- ----------------------------
-- procedure structure for SP_TINH_DOANH_THU_CTY_1_YEAR
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TINH_DOANH_THU_CTY_1_YEAR]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TINH_DOANH_THU_CTY_1_YEAR]
GO

CREATE PROCEDURE [dbo].[SP_TINH_DOANH_THU_CTY_1_YEAR]
@year INT
AS
SELECT DISTINCT MONTH(ngay_mua) thang, SUM(gia_mua) * 0.3 total FROM THU_VIEN_GAME
WHERE YEAR(ngay_mua) = @year
group by MONTH(ngay_mua)
GO


-- ----------------------------
-- procedure structure for SP_TINH_DOANH_THU_CTY_EACH_YEAR
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TINH_DOANH_THU_CTY_EACH_YEAR]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TINH_DOANH_THU_CTY_EACH_YEAR]
GO

CREATE PROCEDURE [dbo].[SP_TINH_DOANH_THU_CTY_EACH_YEAR]
AS
SELECT DISTINCT(year(ngay_mua)) nam, sum(gia_mua) * 0.3 total FROM THU_VIEN_GAME
GROUP BY YEAR(ngay_mua)
GO


-- ----------------------------
-- procedure structure for SP_TINH_DOANH_THU_PARTNER_1_YEAR
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TINH_DOANH_THU_PARTNER_1_YEAR]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TINH_DOANH_THU_PARTNER_1_YEAR]
GO

CREATE PROCEDURE [dbo].[SP_TINH_DOANH_THU_PARTNER_1_YEAR]
    @publisher_id UNIQUEIDENTIFIER,
    @year INT
AS
SELECT DISTINCT MONTH(ngay_mua) thang, SUM(gia_mua) * 0.7 total
FROM THU_VIEN_GAME INNER JOIN GAME G on THU_VIEN_GAME.game_id = G.id
WHERE publisher_id = @publisher_id AND YEAR(ngay_mua) = @year
GROUP BY MONTH(ngay_mua)
GO


-- ----------------------------
-- procedure structure for SP_TINH_DOANH_THU_PARTNER_EACH_YEAR
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TINH_DOANH_THU_PARTNER_EACH_YEAR]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TINH_DOANH_THU_PARTNER_EACH_YEAR]
GO

CREATE PROCEDURE [dbo].[SP_TINH_DOANH_THU_PARTNER_EACH_YEAR]
@publisher_id UNIQUEIDENTIFIER
AS
SELECT DISTINCT(year(ngay_mua)) nam, sum(gia_mua) * 0.7 total
FROM THU_VIEN_GAME INNER JOIN GAME G on THU_VIEN_GAME.game_id = G.id
WHERE publisher_id = @publisher_id
GROUP BY YEAR(ngay_mua)
GO


-- ----------------------------
-- procedure structure for SP_TINH_LUOT_TAI
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TINH_LUOT_TAI]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TINH_LUOT_TAI]
GO

CREATE PROCEDURE [dbo].[SP_TINH_LUOT_TAI] @game_id UNIQUEIDENTIFIER
AS
SELECT COUNT(*) as luot_tai
FROM THU_VIEN_GAME
WHERE game_id = @game_id
GO


-- ----------------------------
-- procedure structure for SP_TOP10_GAME
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TOP10_GAME]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TOP10_GAME]
GO

CREATE PROCEDURE [dbo].[SP_TOP10_GAME]
AS
DECLARE
    @game_table TABLE
                (
                    game_id UNIQUEIDENTIFIER
                )
INSERT INTO @game_table
SELECT TOP 10 TVG.game_id
FROM THU_VIEN_GAME TVG INNER JOIN dbo.GAME G on G.id = TVG.game_id
WHERE isOpened = 1
GROUP BY TVG.game_id
ORDER BY COUNT(*) DESC, AVG(rate) DESC
    IF ((SELECT COUNT(*)
         FROM @game_table) = 0)
        SELECT TOP 10 * FROM GAME WHERE isOpened = 1;
    ELSE
        SELECT * FROM GAME WHERE id IN (SELECT game_id FROM @game_table) AND isOpened = 1
GO


-- ----------------------------
-- procedure structure for SP_TOP_DOI_TAC
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TOP_DOI_TAC]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TOP_DOI_TAC]
GO

CREATE PROCEDURE [dbo].[SP_TOP_DOI_TAC]
AS
BEGIN
    DECLARE @CurrentMonth INT = DATEPART(month, GETDATE());
    DECLARE @CurrentYear INT = DATEPART(year, GETDATE());

    SELECT
        A.id AS publisher_id,
        A.username,
        SUM(TVG.gia_mua) AS total_lifetime_revenue,
        SUM(IIF(DATEPART(month, TVG.ngay_mua) = @CurrentMonth
                    AND DATEPART(year, TVG.ngay_mua) = @CurrentYear, TVG.gia_mua, 0)) AS total_monthly_revenue
    FROM
        THU_VIEN_GAME TVG
            INNER JOIN GAME G on G.id = TVG.game_id
            INNER JOIN ACCOUNT A on A.id = G.publisher_id
    GROUP BY
        A.id,
        A.username
    ORDER BY
        total_lifetime_revenue DESC
END
GO


-- ----------------------------
-- procedure structure for SP_TOP_NAP_TIEN
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TOP_NAP_TIEN]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TOP_NAP_TIEN]
GO

CREATE PROCEDURE [dbo].[SP_TOP_NAP_TIEN]
AS
SELECT account_id, username, (SELECT SUM(gia_mua) FROM THU_VIEN_GAME WHERE THU_VIEN_GAME.account_id = PHIEU_NAP.account_id) as total_spent,
       sum(so_tien) as total_deposit,
       sum(IIF(DATEPART(month, ngay_nap) = DATEPART(month, GETDATE()), so_tien, 0)) as total_monthly_deposit
FROM PHIEU_NAP INNER JOIN dbo.ACCOUNT A on A.id = PHIEU_NAP.account_id
WHERE trang_thai = 1
GROUP BY account_id, username
ORDER BY total_deposit DESC
GO


-- ----------------------------
-- procedure structure for SP_TU_CHOI_RUT_BANK
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SP_TU_CHOI_RUT_BANK]') AND type IN ('P', 'PC', 'RF', 'X'))
	DROP PROCEDURE[dbo].[SP_TU_CHOI_RUT_BANK]
GO

CREATE PROCEDURE [dbo].[SP_TU_CHOI_RUT_BANK]
@id UNIQUEIDENTIFIER
AS
BEGIN TRY
    BEGIN TRANSACTION
        UPDATE PHIEU_RUT_TIEN
        SET trang_thai = 2
        WHERE id = @id
        UPDATE ACCOUNT
        SET so_du_kdoanh = ACCOUNT.so_du_kdoanh + (SELECT so_tien_rut FROM PHIEU_RUT_TIEN WHERE id = @id)
        WHERE id = (SELECT account_id FROM PHIEU_RUT_TIEN WHERE id = @id)
    COMMIT TRANSACTION
end try
begin catch
    rollback transaction
end catch
GO


-- ----------------------------
-- Indexes structure for table ACCOUNT
-- ----------------------------
CREATE NONCLUSTERED INDEX [ix_ho_ten]
ON [dbo].[ACCOUNT] (
  [ho_ten] ASC
)
GO


-- ----------------------------
-- Uniques structure for table ACCOUNT
-- ----------------------------
ALTER TABLE [dbo].[ACCOUNT] ADD CONSTRAINT [UQ__ACCOUNT__F3DBC572FA3DAF8A] UNIQUE NONCLUSTERED ([username] ASC)
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO


-- ----------------------------
-- Primary Key structure for table ACCOUNT
-- ----------------------------
ALTER TABLE [dbo].[ACCOUNT] ADD CONSTRAINT [PK__ACCOUNT__3213E83F6A10468F] PRIMARY KEY CLUSTERED ([id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO


-- ----------------------------
-- Auto increment value for BANK
-- ----------------------------
DBCC CHECKIDENT ('[dbo].[BANK]', RESEED, 1)
GO


-- ----------------------------
-- Primary Key structure for table BANK
-- ----------------------------
ALTER TABLE [dbo].[BANK] ADD CONSTRAINT [PK__BANK__3214EC2752ED4F06] PRIMARY KEY CLUSTERED ([ID])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO


-- ----------------------------
-- Indexes structure for table BANK_ACCOUNT
-- ----------------------------
CREATE NONCLUSTERED INDEX [BANK_ACCOUNT_account_id_index]
ON [dbo].[BANK_ACCOUNT] (
  [account_id] ASC
)
GO


-- ----------------------------
-- Primary Key structure for table BANK_ACCOUNT
-- ----------------------------
ALTER TABLE [dbo].[BANK_ACCOUNT] ADD CONSTRAINT [BANK_ACCOUNT_pk] PRIMARY KEY CLUSTERED ([id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO


-- ----------------------------
-- Primary Key structure for table CARD
-- ----------------------------
ALTER TABLE [dbo].[CARD] ADD CONSTRAINT [PK__CARD__32B628D44C2CCAFA] PRIMARY KEY CLUSTERED ([phieu_nap_id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO


-- ----------------------------
-- Indexes structure for table GAME
-- ----------------------------
CREATE NONCLUSTERED INDEX [GAME_publisher_id_index]
ON [dbo].[GAME] (
  [publisher_id] ASC
)
GO

CREATE NONCLUSTERED INDEX [GAME_age_index]
ON [dbo].[GAME] (
  [age] ASC
)
GO


-- ----------------------------
-- Primary Key structure for table GAME
-- ----------------------------
ALTER TABLE [dbo].[GAME] ADD CONSTRAINT [PK__GAME__3213E83FE8F6891D] PRIMARY KEY CLUSTERED ([id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO


-- ----------------------------
-- Indexes structure for table NAP_CHUYEN_KHOAN
-- ----------------------------
CREATE NONCLUSTERED INDEX [NAP_CHUYEN_KHOAN_hinh_thuc_index]
ON [dbo].[NAP_CHUYEN_KHOAN] (
  [hinh_thuc] ASC
)
GO


-- ----------------------------
-- Primary Key structure for table NAP_CHUYEN_KHOAN
-- ----------------------------
ALTER TABLE [dbo].[NAP_CHUYEN_KHOAN] ADD CONSTRAINT [PK__NAP_CHUY__32B628D48DA738FD] PRIMARY KEY CLUSTERED ([phieu_nap_id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO


-- ----------------------------
-- Indexes structure for table PENDING_GAMES
-- ----------------------------
CREATE NONCLUSTERED INDEX [PENDING_GAMES_game_id_index]
ON [dbo].[PENDING_GAMES] (
  [game_id] ASC
)
GO


-- ----------------------------
-- Primary Key structure for table PENDING_GAMES
-- ----------------------------
ALTER TABLE [dbo].[PENDING_GAMES] ADD CONSTRAINT [PK__PENDING___8F762C6C7404A5B6] PRIMARY KEY CLUSTERED ([review_id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO


-- ----------------------------
-- Indexes structure for table PHIEU_KIEM_DUYET
-- ----------------------------
CREATE NONCLUSTERED INDEX [PHIEU_KIEM_DUYET_publisher_id_index]
ON [dbo].[PHIEU_KIEM_DUYET] (
  [publisher_id] ASC
)
GO


-- ----------------------------
-- Primary Key structure for table PHIEU_KIEM_DUYET
-- ----------------------------
ALTER TABLE [dbo].[PHIEU_KIEM_DUYET] ADD CONSTRAINT [PK__PHIEU_KI__3213E83F4F1AF8C7] PRIMARY KEY CLUSTERED ([id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO


-- ----------------------------
-- Indexes structure for table PHIEU_NAP
-- ----------------------------
CREATE NONCLUSTERED INDEX [PHIEU_NAP_account_id_index]
ON [dbo].[PHIEU_NAP] (
  [account_id] ASC
)
GO


-- ----------------------------
-- Triggers structure for table PHIEU_NAP
-- ----------------------------
CREATE TRIGGER [dbo].[TRG_XOA_PHIEU_NAP]
ON [dbo].[PHIEU_NAP]
WITH EXECUTE AS CALLER
INSTEAD OF DELETE
AS
DELETE
    FROM CARD
    WHERE phieu_nap_id = (SELECT id FROM deleted)
    DELETE
    FROM PHIEU_NAP
    WHERE id = (SELECT id FROM deleted)
GO


-- ----------------------------
-- Primary Key structure for table PHIEU_NAP
-- ----------------------------
ALTER TABLE [dbo].[PHIEU_NAP] ADD CONSTRAINT [PK__PHIEU_NA__3213E83FAA0AE9CF] PRIMARY KEY CLUSTERED ([id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO


-- ----------------------------
-- Indexes structure for table PHIEU_RUT_TIEN
-- ----------------------------
CREATE NONCLUSTERED INDEX [PHIEU_RUT_TIEN_account_id_index]
ON [dbo].[PHIEU_RUT_TIEN] (
  [account_id] ASC
)
GO


-- ----------------------------
-- Primary Key structure for table PHIEU_RUT_TIEN
-- ----------------------------
ALTER TABLE [dbo].[PHIEU_RUT_TIEN] ADD CONSTRAINT [PK__PHIEU_RU__3213E83FEEB1367F] PRIMARY KEY CLUSTERED ([id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO


-- ----------------------------
-- Primary Key structure for table RUT_TIEN_NGAN_HANG
-- ----------------------------
ALTER TABLE [dbo].[RUT_TIEN_NGAN_HANG] ADD CONSTRAINT [PK__RUT_TIEN__7AE65AB025F60B7F] PRIMARY KEY CLUSTERED ([phieu_rut_id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO


-- ----------------------------
-- Primary Key structure for table THU_VIEN_GAME
-- ----------------------------
ALTER TABLE [dbo].[THU_VIEN_GAME] ADD CONSTRAINT [PK__THU_VIEN__A95C333105DEBA15] PRIMARY KEY CLUSTERED ([account_id], [game_id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO


-- ----------------------------
-- Foreign Keys structure for table BANK_ACCOUNT
-- ----------------------------
ALTER TABLE [dbo].[BANK_ACCOUNT] ADD CONSTRAINT [FK__BANK_ACCO__accou__17036CC0] FOREIGN KEY ([account_id]) REFERENCES [dbo].[ACCOUNT] ([id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO

ALTER TABLE [dbo].[BANK_ACCOUNT] ADD CONSTRAINT [FK__BANK_ACCO__bank___160F4887] FOREIGN KEY ([bank_id]) REFERENCES [dbo].[BANK] ([ID]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO


-- ----------------------------
-- Foreign Keys structure for table CARD
-- ----------------------------
ALTER TABLE [dbo].[CARD] ADD CONSTRAINT [FK__CARD__phieu_nap___778AC167] FOREIGN KEY ([phieu_nap_id]) REFERENCES [dbo].[PHIEU_NAP] ([id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO


-- ----------------------------
-- Foreign Keys structure for table GAME
-- ----------------------------
ALTER TABLE [dbo].[GAME] ADD CONSTRAINT [FK__GAME__publisher___6754599E] FOREIGN KEY ([publisher_id]) REFERENCES [dbo].[ACCOUNT] ([id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO


-- ----------------------------
-- Foreign Keys structure for table NAP_CHUYEN_KHOAN
-- ----------------------------
ALTER TABLE [dbo].[NAP_CHUYEN_KHOAN] ADD CONSTRAINT [FK__NAP_CHUYE__phieu__7A672E12] FOREIGN KEY ([phieu_nap_id]) REFERENCES [dbo].[PHIEU_NAP] ([id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO


-- ----------------------------
-- Foreign Keys structure for table PENDING_GAMES
-- ----------------------------
ALTER TABLE [dbo].[PENDING_GAMES] ADD CONSTRAINT [FK__PENDING_G__revie__6D0D32F4] FOREIGN KEY ([review_id]) REFERENCES [dbo].[PHIEU_KIEM_DUYET] ([id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO


-- ----------------------------
-- Foreign Keys structure for table PHIEU_KIEM_DUYET
-- ----------------------------
ALTER TABLE [dbo].[PHIEU_KIEM_DUYET] ADD CONSTRAINT [FK_PKD_PGAME] FOREIGN KEY ([publisher_id]) REFERENCES [dbo].[ACCOUNT] ([id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO


-- ----------------------------
-- Foreign Keys structure for table PHIEU_NAP
-- ----------------------------
ALTER TABLE [dbo].[PHIEU_NAP] ADD CONSTRAINT [FK__PHIEU_NAP__accou__74AE54BC] FOREIGN KEY ([account_id]) REFERENCES [dbo].[ACCOUNT] ([id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO


-- ----------------------------
-- Foreign Keys structure for table PHIEU_RUT_TIEN
-- ----------------------------
ALTER TABLE [dbo].[PHIEU_RUT_TIEN] ADD CONSTRAINT [FK__PHIEU_RUT__accou__7E37BEF6] FOREIGN KEY ([account_id]) REFERENCES [dbo].[ACCOUNT] ([id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO


-- ----------------------------
-- Foreign Keys structure for table RUT_TIEN_NGAN_HANG
-- ----------------------------
ALTER TABLE [dbo].[RUT_TIEN_NGAN_HANG] ADD CONSTRAINT [FK__RUT_TIEN___phieu__01142BA1] FOREIGN KEY ([phieu_rut_id]) REFERENCES [dbo].[PHIEU_RUT_TIEN] ([id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO

ALTER TABLE [dbo].[RUT_TIEN_NGAN_HANG] ADD CONSTRAINT [FK__RUT_TIEN___bank___02084FDA] FOREIGN KEY ([bank_id]) REFERENCES [dbo].[BANK] ([ID]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO


-- ----------------------------
-- Foreign Keys structure for table THU_VIEN_GAME
-- ----------------------------
ALTER TABLE [dbo].[THU_VIEN_GAME] ADD CONSTRAINT [FK__THU_VIEN___accou__6FE99F9F] FOREIGN KEY ([account_id]) REFERENCES [dbo].[ACCOUNT] ([id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO

ALTER TABLE [dbo].[THU_VIEN_GAME] ADD CONSTRAINT [FK__THU_VIEN___game___70DDC3D8] FOREIGN KEY ([game_id]) REFERENCES [dbo].[GAME] ([id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO

