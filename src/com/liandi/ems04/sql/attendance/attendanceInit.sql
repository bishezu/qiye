/*
Navicat MySQL Data Transfer

Source Server         : 10.10.1.188
Source Server Version : 50550
Source Host           : 10.10.1.188:3306
Source Database       : ems04

Target Server Type    : MYSQL
Target Server Version : 50550
File Encoding         : 65001

Date: 2018-02-08 10:21:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_attendance
-- ----------------------------
DROP TABLE IF EXISTS `t_attendance`;
CREATE TABLE `t_attendance` (
  `attendance_id` int(11) NOT NULL AUTO_INCREMENT,
  `sid` int(11) NOT NULL,
  `name` varchar(32) NOT NULL,
  `present_date` date NOT NULL,
  `check_in` time DEFAULT NULL,
  `check_out` time DEFAULT NULL,
  `arrive_late` tinyint(1) DEFAULT NULL,
  `leave_early` tinyint(1) DEFAULT NULL,
  `half_absenteeism` tinyint(1) DEFAULT NULL,
  `absenteeism` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`attendance_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2256 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_attendance
-- ----------------------------
INSERT INTO `t_attendance` VALUES ('2065', '1010', '王金平1', '2018-01-15', '09:30:48', '16:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2066', '1010', '王金平1', '2018-01-16', '07:30:48', '17:35:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2067', '1010', '王金平1', '2018-01-17', '09:24:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2068', '1010', '王金平1', '2018-01-18', '10:30:48', '17:29:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2069', '1010', '王金平1', '2018-01-19', '09:30:48', '17:29:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2070', '1010', '王金平1', '2018-01-20', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2071', '1010', '王金平1', '2018-01-21', '07:30:48', '17:29:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2072', '1010', '王金平1', '2018-01-22', '10:30:48', '16:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2073', '1010', '王金平1', '2018-01-23', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2074', '1010', '王金平1', '2018-01-24', '09:30:48', '15:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2075', '1010', '王金平1', '2018-01-25', '09:30:48', '14:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2076', '1010', '王金平1', '2018-01-26', '09:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2077', '1010', '王金平1', '2018-01-14', '09:20:48', '21:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2078', '1010', '王金平1', '2018-02-15', '07:29:48', '17:36:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2079', '1010', '王金平1', '2018-02-16', '07:29:48', '17:36:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2080', '1011', '安妮1', '2018-01-01', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2081', '1011', '安妮1', '2018-01-02', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2082', '1011', '安妮1', '2018-01-12', '10:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2083', '1011', '安妮1', '2018-01-13', '09:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2084', '1011', '安妮1', '2018-01-14', '08:30:48', '16:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2085', '1011', '安妮1', '2018-01-15', '10:30:48', '12:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2086', '1011', '安妮1', '2018-01-16', '09:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2087', '1011', '安妮1', '2018-01-17', '08:30:48', '15:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2088', '1011', '安妮1', '2018-01-18', '10:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2089', '1011', '安妮1', '2018-01-19', '08:10:48', '17:40:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2090', '1011', '安妮1', '2018-01-20', '07:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2091', '1011', '安妮1', '2018-01-21', '09:35:48', '20:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2092', '1011', '安妮1', '2018-01-22', '09:31:48', '20:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2093', '1011', '安妮1', '2018-01-23', '06:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2094', '1011', '安妮1', '2018-01-24', '14:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2095', '1012', '王金平2', '2018-01-02', '08:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2096', '1012', '王金平2', '2018-01-04', '07:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2097', '1012', '王金平2', '2018-01-11', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2098', '1012', '王金平2', '2018-01-12', '10:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2099', '1012', '王金平2', '2018-01-13', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2100', '1012', '王金平2', '2018-01-14', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2101', '1012', '王金平2', '2018-01-15', '09:30:48', '21:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2102', '1012', '王金平2', '2018-01-16', '07:30:48', '17:29:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2103', '1012', '王金平2', '2018-01-17', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2104', '1012', '王金平2', '2018-01-18', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2105', '1013', '安妮2', '2018-01-02', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2106', '1013', '安妮2', '2018-01-04', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2107', '1013', '安妮2', '2018-01-11', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2108', '1013', '安妮2', '2018-01-12', '11:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2109', '1013', '安妮2', '2018-01-13', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2110', '1013', '安妮2', '2018-01-14', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2111', '1013', '安妮2', '2018-01-15', '09:30:48', '20:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2112', '1013', '安妮2', '2018-01-15', '09:30:48', '20:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2113', '1013', '安妮2', '2018-01-16', '11:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2114', '1013', '安妮2', '2018-01-17', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2115', '1013', '安妮2', '2018-01-18', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2116', '1014', '王金平3', '2018-01-02', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2117', '1014', '王金平3', '2018-01-04', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2118', '1014', '王金平3', '2018-01-11', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2119', '1014', '王金平3', '2018-01-12', '11:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2120', '1014', '王金平3', '2018-01-13', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2121', '1014', '王金平3', '2018-01-14', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2122', '1014', '王金平3', '2018-01-15', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2123', '1014', '王金平3', '2018-01-16', '11:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2124', '1014', '王金平3', '2018-01-17', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2125', '1014', '王金平3', '2018-01-18', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2126', '1014', '王金平3', '2018-01-19', '10:30:48', '13:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2127', '1015', '安妮3', '2018-01-02', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2128', '1015', '安妮3', '2018-01-04', '07:30:48', '10:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2129', '1015', '安妮3', '2018-01-11', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2130', '1015', '安妮3', '2018-01-12', '11:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2131', '1015', '安妮3', '2018-01-13', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2132', '1015', '安妮3', '2018-01-14', '09:20:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2133', '1015', '安妮3', '2018-01-15', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2134', '1015', '安妮3', '2018-01-16', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2135', '1015', '安妮3', '2018-01-17', '11:30:48', '14:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2136', '1015', '安妮3', '2018-01-18', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2137', '1015', '安妮3', '2018-01-19', '09:10:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2138', '1015', '安妮3', '2018-01-20', '09:10:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2139', '1015', '安妮3', '2018-01-21', '14:10:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2140', '1016', 'wang1', '2018-01-02', '07:30:48', '17:20:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2141', '1016', 'wang1', '2018-01-04', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2142', '1016', 'wang1', '2018-01-11', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2143', '1016', 'wang1', '2018-01-12', '09:20:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2144', '1016', 'wang1', '2018-01-13', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2145', '1016', 'wang1', '2018-01-14', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2146', '1016', 'wang1', '2018-01-15', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2147', '1016', 'wang1', '2018-01-16', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2148', '1016', 'wang1', '2018-01-17', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2149', '1016', 'wang1', '2018-01-18', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2150', '1016', 'wang1', '2018-01-19', '08:30:48', '11:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2151', '1016', 'wang1', '2018-01-21', '09:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2152', '1017', 'wang2', '2018-01-02', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2153', '1017', 'wang2', '2018-01-04', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2154', '1017', 'wang2', '2018-01-11', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2155', '1017', 'wang2', '2018-01-12', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2156', '1017', 'wang2', '2018-01-13', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2157', '1017', 'wang2', '2018-01-14', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2158', '1017', 'wang2', '2018-01-15', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2159', '1017', 'wang2', '2018-01-16', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2160', '1017', 'wang2', '2018-01-17', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2161', '1017', 'wang2', '2018-01-18', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2162', '1017', 'wang2', '2018-01-19', '09:10:20', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2163', '1017', 'wang2', '2018-01-20', '09:10:20', '12:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2164', '1018', 'wang3', '2018-01-02', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2165', '1018', 'wang3', '2018-01-04', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2166', '1018', 'wang3', '2018-01-11', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2167', '1018', 'wang3', '2018-01-12', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2168', '1018', 'wang3', '2018-01-13', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2169', '1018', 'wang3', '2018-01-14', '09:30:48', '20:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2170', '1018', 'wang3', '2018-01-15', '10:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2171', '1018', 'wang3', '2018-01-16', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2172', '1018', 'wang3', '2018-01-17', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2173', '1018', 'wang3', '2018-01-18', '08:30:48', '17:25:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2174', '1018', 'wang3', '2018-01-19', '09:20:48', '18:25:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2175', '1018', 'wang3', '2018-01-20', '09:20:48', '13:25:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2176', '1019', 'wang4', '2018-01-02', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2177', '1019', 'wang4', '2018-01-04', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2178', '1019', 'wang4', '2018-01-11', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2179', '1019', 'wang4', '2018-01-12', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2180', '1019', 'wang4', '2018-01-13', '08:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2181', '1019', 'wang4', '2018-01-14', '09:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2182', '1019', 'wang4', '2018-01-15', '10:30:48', '17:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2183', '1019', 'wang4', '2018-01-16', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2184', '1019', 'wang4', '2018-01-17', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2185', '1019', 'wang4', '2018-01-18', '13:30:48', '16:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2186', '1020', 'wang5', '2018-01-02', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2187', '1020', 'wang5', '2018-01-04', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2188', '1020', 'wang5', '2018-01-11', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2189', '1020', 'wang5', '2018-01-12', '08:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2190', '1020', 'wang5', '2018-01-13', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2191', '1020', 'wang5', '2018-01-14', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2192', '1020', 'wang5', '2018-01-15', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2193', '1020', 'wang5', '2018-01-16', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2194', '1020', 'wang5', '2018-01-17', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2195', '1020', 'wang5', '2018-01-18', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2196', '1021', 'wang6', '2018-01-02', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2197', '1021', 'wang6', '2018-01-04', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2198', '1021', 'wang6', '2018-01-11', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2199', '1021', 'wang6', '2018-01-12', '08:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2200', '1021', 'wang6', '2018-01-13', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2201', '1021', 'wang6', '2018-01-14', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2202', '1021', 'wang6', '2018-01-15', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2203', '1021', 'wang6', '2018-01-16', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2204', '1021', 'wang6', '2018-01-17', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2205', '1021', 'wang6', '2018-01-18', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2206', '1022', '老刘1', '2018-01-02', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2207', '1022', '老刘1', '2018-01-04', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2208', '1022', '老刘1', '2018-01-11', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2209', '1022', '老刘1', '2018-01-12', '10:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2210', '1022', '老刘1', '2018-01-13', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2211', '1022', '老刘1', '2018-01-14', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2212', '1022', '老刘1', '2018-01-15', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2213', '1022', '老刘1', '2018-01-16', '07:30:48', '20:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2214', '1022', '老刘1', '2018-01-17', '07:30:48', '16:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2215', '1022', '老刘1', '2018-01-18', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2216', '1023', '老李', '2018-01-02', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2217', '1023', '老李', '2018-01-04', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2218', '1023', '老李', '2018-01-11', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2219', '1023', '老李', '2018-01-12', '10:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2220', '1023', '老李', '2018-01-13', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2221', '1023', '老李', '2018-01-14', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2222', '1023', '老李', '2018-01-15', '08:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2223', '1023', '老李', '2018-01-16', '07:30:48', '20:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2224', '1023', '老李', '2018-01-17', '09:30:48', '16:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2225', '1023', '老李', '2018-01-18', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2226', '1024', '老刘2', '2018-01-02', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2227', '1024', '老刘2', '2018-01-04', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2228', '1024', '老刘2', '2018-01-11', '08:30:48', '17:40:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2229', '1024', '老刘2', '2018-01-12', '10:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2230', '1024', '老刘2', '2018-01-13', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2231', '1024', '老刘2', '2018-01-14', '08:20:48', '17:50:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2232', '1024', '老刘2', '2018-01-15', '08:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2233', '1024', '老刘2', '2018-01-16', '07:30:48', '17:36:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2234', '1024', '老刘2', '2018-01-17', '09:24:48', '20:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2235', '1024', '老刘2', '2018-01-18', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2236', '1025', '老刘3', '2018-01-02', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2237', '1025', '老刘3', '2018-01-04', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2238', '1025', '老刘3', '2018-01-11', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2239', '1025', '老刘3', '2018-01-12', '08:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2240', '1025', '老刘3', '2018-01-13', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2241', '1025', '老刘3', '2018-01-14', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2242', '1025', '老刘3', '2018-01-15', '08:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2243', '1025', '老刘3', '2018-01-16', '07:30:48', '20:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2244', '1025', '老刘3', '2018-01-17', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2245', '1025', '老刘3', '2018-01-18', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2246', '1026', '老五', '2018-01-02', '07:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2247', '1026', '老五', '2018-01-04', '07:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2248', '1026', '老五', '2018-01-11', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2249', '1026', '老五', '2018-01-12', '08:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2250', '1026', '老五', '2018-01-13', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2251', '1026', '老五', '2018-01-14', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2252', '1026', '老五', '2018-01-15', '08:30:48', '18:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2253', '1026', '老五', '2018-01-16', '07:30:48', '20:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2254', '1026', '老五', '2018-01-17', '08:30:48', '19:30:48', null, null, null, null);
INSERT INTO `t_attendance` VALUES ('2255', '1026', '老五', '2018-01-18', '07:30:48', '18:30:48', null, null, null, null);
