insert into `user_table` (`id`, `name`, `phone`, `mail`, `address`, `birth`, `photo_path`, `mbti`)
values
('joo', '강주영', '010-8299-8834', 'joo.zero.10@gmail.com', '도신로 29길 28', '2002-10-25', 'testPhotoPath', 'ESTP'),
('pang', '황다희', '010-1111-2222', 'pang@gmail.com', '미아사거리어딘가', '2002-05-28', 'testPhotoPath', 'ENFP'),
('park', '박예진', '010-3333-4444', 'park@gmail.com', '아현어딘가', '2002-07-21', 'testPhotoPath', 'ISTJ')
('yu', '유채린', '010-4444-4444', 'yu@gmail.com', '여의도어딘가혹은역삼어딘가', '2002-09-18', 'testPhotoPath', 'INFP');



insert into `school` (`id`, `level`, `name`)
values
('a', 'm', 'a중학교'),
('b', 'e', 'b초등학교'),
('d', 'e', 'd초등학교'),
('e', 'm', 'e중학교'),
('f', 'h', 'f고등학교'),
('g', 'h', 'g고등학교'),
('c', 'h', 'c고등학교');


insert into `user_school` (`graduation_year`, `school_id`,`user_id`)
VALUES
('2018', 'a', 'joo'),
('2018', 'a', 'pang'),
('2020', 'b', 'joo'),
('2021', 'f', 'joo'),
('2021', 'f', 'park'),
('2021', 'f', 'yu');