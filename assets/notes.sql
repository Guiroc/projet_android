create table CLASSE(
idClasse int,
LibClasse varchar(50),
NbClasse int,

constraint pk_CLASSE primary key (idClasse));


create table ELEVE(
idEleve int,
NomEleve varchar(50),
PrenomEleve varchar(50),
DateNaissEleve date,

ClasseEleve int,

constraint pk_ELEVE primary key (idEleve),
constraint fk_ClasseEleve foreign key (ClasseEleve) references CLASSE (idClasse));


create table MATIERE(
idMatiere int,
nomMatiere varchar(50),
coefMatiere int,

constraint pk_MATIERE primary key (idMatiere));


create table DEVOIR(
idDevoir int,
dateDevoir date,

MatiereDevoir int,

constraint pk_DEVOIR primary key (idDevoir, MatiereDevoir),
constraint fk_MatiereDevoir foreign key (MatiereDevoir) references MATIERE (idMatiere));


create table PARTICIPER(
noteDevoirEleve decimal(10,3),

EleveParticiper int,
DevoirParticiper int,
MatiereDevoirParticiper int,

constraint pk_PARTICIPER primary key (EleveParticiper, DevoirParticiper, MatiereDevoirParticiper),
constraint fk_EleveParticiper foreign key (EleveParticiper) references ELEVE (idEleve),
constraint fk_DevoirParticiper foreign key (DevoirParticiper,MatiereDevoirParticiper) references DEVOIR (idDevoir,MatiereDevoir));