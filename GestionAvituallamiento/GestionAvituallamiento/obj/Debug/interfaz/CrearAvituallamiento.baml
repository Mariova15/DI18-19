   M S B A M L   `   `   `  ����  GestionAvituallamiento:    4GestionAvituallamiento.interfaz.CrearAvituallamiento   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  CrearAvituallamiento��5   	   $	��300��6&   $��333.891��63   .��5      � .+�5   
   �� -   5         ��Name$ 
labelTitle��5      $#��Creación de avituallamientos��6$   $��10,10,138,0q�6K   $	��Top=�6`   $
��Bold"�6x   �� 5   
   -   5        $ labelPK��5      $��Punto kilométrico��6!   $
��Left=�6=   $��	10,41,0,0q�6X   $	��Top=�6k   $	��163��6�   �� 5   
   -   5        $ labelPersonaContacto��5      $��Persona de contacto��6.   $��Center=�6L   $��10,72,138,0q�6i   $	��Top=�6~   $	��178��6�   $
��Bold"�6�   �� 5	   
   -   5        $ labelNombrePersona��5	      $��Nombre��6,   $��Center=�6=   $��10,103,153,0q�6Z   $	��Top=�6p   $	��163��6�   �� 5
   
   -   5        $ labelTelefonoPersona��5
      $��	Teléfono��6.   $��Center=�6A   $��10,134,153,0q�6^   $	��Top=�6t   $	��163��6�   �� 5   
   -   5         ��Name$ 	textBoxPK��5      $
��Left=�6�   $��23��6�   $��
178,44,0,0q�6�    �� TextWrapping$
 Wrap=�6�   $	��Top=�6  $	��120��6  ��6I   �� *" avituallamiento.PuntoKilometrico+ �� NotifyOnValidationError .  �� ValidatesOnDataErrors . 6  �� 5   
   -   5        $ textBoxNombrePersona��5      $
��Left=�5   t   $��23��6�   $��178,106,0,0q�6�   $
 Wrap=�6�   $	��Top=�6�   $	��120��6�   ��6   �� *personaContacto.Nombre+ .  . 6�   �� 5   
   -   5        $ textBoxTelefonoPersona��5      $
��Left=�5   u   $��23��6�   $��178,137,0,0q�6�   $
 Wrap=�6�   $	��Top=�6�   $	��120��6�   ��6   �� *personaContacto.NumTelf+ .  . 6�   �� 5   
   -	   5         ��Name$  ButtonCrearAvituallamiento��5      $��Crear avituallamiento��65   $��10,225,10,0q�6U   $	��Top=�6j   6�   �� 5   
   -
   5        $ ButtonAnnadirMaterial��5      $��Añadir material��60   $
��Left=�6J   $��
10,200,0,0q�6e   $	��Top=�6y   $	��123��6�   6�   5      5      