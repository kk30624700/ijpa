-- ----------------------------
-- Table structure for `appointment`
-- ----------------------------
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment` (
  `appointment_id` int NOT NULL AUTO_INCREMENT,
  `book_id` int NOT NULL,
  `student_id` int NOT NULL,
  `appoint_time` timestamp DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`appointment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `book_id` int NOT NULL AUTO_INCREMENT,
  `book_name` varchar(32) DEFAULT NULL,
  `book_number` int NOT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int NOT NULL AUTO_INCREMENT,
  `student_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'book1', 100);
INSERT INTO `book` VALUES ('2', 'book2', 100);

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', 'student1');
INSERT INTO `student` VALUES ('2', 'studnet2');
