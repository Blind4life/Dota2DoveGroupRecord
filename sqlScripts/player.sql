drop table if exists `gugugu`.`players`;
create table `gugugu`.`players` (
	`nick_name` varchar(10) not null,
    `account_id` int(9) not null,
    primary key(`account_id`)
);
Insert into `players` (`nick_name`, `account_id`) value ('冬泳怪鸽', '137197970');
Insert into `players` (`nick_name`, `account_id`) value ('鸽鬼', '147407336');
Insert into `players` (`nick_name`, `account_id`) values ('鸽痴', '153873876');
Insert into `players` (`nick_name`, `account_id`) values ('鸽王', '137087039');
Insert into `players` (`nick_name`, `account_id`) values ('鸽神', '136513604');
Insert into `players` (`nick_name`, `account_id`) values ('鸽鲲', '149189564');
Insert into `players` (`nick_name`, `account_id`) values ('鸽帝', '147422121');
Insert into `players` (`nick_name`, `account_id`) values ('鸽神', '147401546');