-- Database: teste

-- DROP DATABASE IF EXISTS teste;

CREATE DATABASE teste
    WITH-- SCHEMA: public

-- DROP SCHEMA IF EXISTS public ;
SELECT codigo, descricao, nome, adm_id
	FROM public.pastel;
	SELECT codigo, descricao, nome, adm_id
	FROM public.pastel;
	
SELECT * FROM public.pastel;	
	
SELECT codigo, funcao, nome 
	FROM public.administrador;
	
SELECT * FROM Pedido;

drop schema public cascade;

create schema public;

SELECT codigo, funcao, nome
FROM public.pastel;

SELECT nome, descricao
	FROM public.pastel;

SELECT adm_id, adnome, addescricao
	FROM public.administrador;
	
