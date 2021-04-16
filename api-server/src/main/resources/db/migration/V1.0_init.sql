CREATE TABLE `articles` (
  `article_id` int(20) unsigned NOT NULL,
  `created_at` timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3),
--  `updated_at` timestamp(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3),
  `author` int(20) unsigned NOT NULL,
  `content` char(100),
-- hmm content..
--  `editor` int(20) unsigned NOT NULL,
--  `revision` int(20) unsigned NOT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `users` (
  `user_id` int(20) unsigned NOT NULL,
  `name` char(100) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
