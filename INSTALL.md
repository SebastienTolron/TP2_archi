# Installer et mettre à jour CSHB

## Terminer l'installation de Symfony

* Installer un serveur Apache, PHP, MySQL (Windows : WAMP)
* Copier le fichier "parameters.yml" depuis defaultfiles/ dans app/config/
* Dans la racine du site, exécutez : php composer.phar install
* Indiquer votre racine dans votre configuration Apache (dans Windows, mettez le dossier racine dans de dossier www de Wamp)
* Allez à l'URL de la config : <racine>/web/config.php (Windows : http://localhost/<dossierRacine>/web/config.php)
* Une fois toutes les possibles erreurs de configuration corrigées, rendez-vous sur <racine>/web/app_dev.php
* Vous devriez avoir l'interface Synfony 2
* Configurer votre base de données Doctrine

## Initialiser l'administration

* Exécuter la commande : php composer.phar update
* Génerer les entités d'administration : php app/console doctrine:schema:update --force
* Ajouter un administrateur (ex : php app/console fos:user:create admin admin@app.com admin --super-admin)
* Allez à l'URL : <racine>/web/app_dev.php/login

## Initialiser les droits

* Exécuter la commande : php app/console init:acl
* Exécuter la commande : php app/console sonata:admin:setup-acl
* Executer les commandes sql suivantes :


		INSERT INTO `fos_group` (`id`, `name`, `roles`) VALUES
		(1, 'Admin', 'a:3:{i:0;s:17:"ROLE_SONATA_ADMIN";i:1;s:23:"ROLE_SONATA_SUPER_ADMIN";i:2;s:16:"ROLE_SUPER_ADMIN";}'),
		(2, 'Responsable des tournois', 'a:5:{i:0;s:31:"ROLE_SONATA_ADMIN_TOURNOI_ADMIN";i:1;s:33:"ROLE_SONATA_ADMIN_CATEGORIE_ADMIN";i:2;s:28:"ROLE_SONATA_ADMIN_CLUB_ADMIN";i:3;s:34:"ROLE_SONATA_ADMIN_EQUIPECLUB_ADMIN";i:4;s:17:"ROLE_SONATA_ADMIN";}'),
		(3, 'Parents dirigeant', 'a:2:{i:0;s:9:"ROLE_USER";i:1;s:34:"ROLE_SONATA_ADMIN_NEWSEQUIPE_ADMIN";}'),
		(4, 'Licencié', 'a:2:{i:0;s:34:"ROLE_SONATA_ADMIN_NEWSEQUIPE_ADMIN";i:1;s:9:"ROLE_USER";}');
		
		

* Pour initialisez les droits sur un objet ( Comme une inscription pour le responsable de tournoi par exemple ) il faut :

	* Créer un objet 
	* Executer la commande php app/console sonata:admin:generate-object-acl
	* Supprimer l'objet( Pas obligatoire )
 les droits seront alors initialiser pour tous les objets de ce type.






## Initialiser le panneau d'admin

* Exécuter la commande : php composer.phar update
* Génerer les entités d'administration : php app/console doctrine:schema:update --force
* Allez à l'URL : <racine>/web/app_dev.php/admin/dashboard

### Problème de intl sous Windows

* Aller dans C:\wamp\bin\php\php5<version>
* Décomenter la ligne "extension=php_intl.dll"

## Mise à jour des styles

* En cas de problème dans la mise à jour des syles, veuillez supprimer les éléments du cache : php app/console cache:clear
* php app/console assets:install web/ --symlink
* Veuillez enlever le --symlink si vous utilisez un système de fichiers n'acceptant pas les liens symboliques