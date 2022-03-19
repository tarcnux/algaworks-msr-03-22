create table ocorrencia (
	id bigint not null primary key auto_increment,
    entrega_id bigint not null,
    descricao text not null,
    data_registro datetime not null,
    constraint fk_ocorrencia_entrega
    foreign key(entrega_id) references entrega (id)    
);