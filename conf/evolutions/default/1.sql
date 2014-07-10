# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table blog (
  id                        bigint not null,
  header                    varchar(255),
  text                      TEXT,
  time                      varchar(255),
  author                    varchar(255),
  constraint pk_blog primary key (id))
;

create table comment (
  id                        bigint not null,
  text                      varchar(255),
  blog_id                   bigint,
  constraint pk_comment primary key (id))
;

create table users (
  id                        bigint not null,
  username                  varchar(255),
  password                  varchar(255),
  constraint pk_users primary key (id))
;

create sequence blog_seq;

create sequence comment_seq;

create sequence users_seq;

alter table comment add constraint fk_comment_blog_1 foreign key (blog_id) references blog (id) on delete restrict on update restrict;
create index ix_comment_blog_1 on comment (blog_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists blog;

drop table if exists comment;

drop table if exists users;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists blog_seq;

drop sequence if exists comment_seq;

drop sequence if exists users_seq;

