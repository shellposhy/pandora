/*==============================================================*/
/* Table: TEST_USER                                             */
/*==============================================================*/
create table TEST_USER 
(
   ID                   NUMBER               not null,
   USER_NAME            VARCHAR(50),
   EMAIL                VARCHAR(50),
   constraint PK_TEST_USER primary key (ID)
);

comment on table TEST_USER is
'测试建表';

comment on column TEST_USER.ID is
'主键';

comment on column TEST_USER.USER_NAME is
'用户名';

comment on column TEST_USER.EMAIL is
'邮箱';

 grant select, insert, update, delete, references, alter, index on shfpdjpt.TEST_USER to SHFP;