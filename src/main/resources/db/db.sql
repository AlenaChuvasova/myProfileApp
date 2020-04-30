CREATE SCHEMA `my_profile` DEFAULT CHARACTER SET utf8;

CREATE TABLE `my_profile`.`user`
(
  `id`        INT         NOT NULL,
  `user_name` VARCHAR(45) NOT NULL,
  `email`     VARCHAR(45) NOT NULL,
  `password`  VARCHAR(45) NOT NULL,
  `active`    TINYINT(1)  NULL,
  `roles`     VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8
  COLLATE = utf8_latvian_ci;