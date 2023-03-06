-- Initialisation des tables
INSERT INTO Categorie(Categorie_nom, Categorie_description, Categorie_photo) VALUES
    ('Appareils d anesthésie', NULL,'https://photos.google.com/photo/AF1QipNpiGCTV_NsLZr6LX6TBP0xmsoKYVVcr-UM3Au8'), -- Les clés sont auto-générées
    ('Ventilateur d anesthésie', NULL,'https://photos.google.com/photo/AF1QipOi2cm-3IxlCJ4DjdonRC2jGf95-FwJl16kyZBk'),
    ('Ventilateur de réanimation', 'je suis une description','https://photos.google.com/photo/AF1QipOaUupqUsDpyTBMaZMIJ6TZBrnlj-QqV2hyaQ40');

INSERT INTO Salle (Salle_nom) VALUES
    ('Salle A'),
    ('Salle B'),
    ('Salle C');
INSERT INTO Objet(Objet_nom, Objet_annee, Objet_createur, Objet_pays, Objet_description, Objet_photo, nb_Possession, categorie, salle) VALUES
    ('Heidbrink', '1945', 'US Army', 'USA', 'Surplus de l US Army', 'https://photos.google.com/photo/AF1QipMY4jS6OtFEj7M7VeaK44wgNo75fTK3gD4AZmAn', '1', Select id from categorie where Categorie_nom='Appareils d anesthésie', select id from salle where Salle_nom='Salle A' );

INSERT INTO MultimediaCat(descriptionCat, URL_photoCat, URL_audioCat, URL_videoCat, categorie ) VALUES
    ('je suis une description d une categorie multimedia', NULL, NULL, NULL, select id from categorie where Categorie_nom ='Ventilateur de réanimation');

INSERT INTO MultimediaObj(descriptionObj, URL_photoObj, URL_audioObj, URL_videoObj, objet ) VALUES
    ('je suis une description d un objet multimedia', NULL, NULL, NULL, select id from objet where Objet_nom ='Heidbrink');

    