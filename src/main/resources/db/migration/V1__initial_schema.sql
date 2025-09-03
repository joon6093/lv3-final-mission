create table reservation (
                             id bigint auto_increment,
                             crew varchar(255) not null,
                             description varchar(255) not null,
                             identifier varchar(255) not null,
                             status enum('CANCELED','CONFIRMED') not null,
                             primary key (id)
);
