   M S B A M L   `   `   `  ����  GestionAvituallamiento3    -GestionAvituallamiento.interfaz.CrearMaterial   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$  CrearMaterial��5   	   $	��300��6   $��324.291��6,   .��5      � .+�5   
   �� -   5         ��Name$ 
labelTitle��5      $��Crear material��6$   $
��Left=�6=   $��	10,10,0,0q�6X   $	��Top=�6k   $	��178��6�   $
��Bold"�6�   �� 5   
   -   5        $ labelNombreProducto��5      $��Nombre del producto��6-   $��
8,44,144,0q�6K   $	��Top=�6_   �� 5   
   -   5        $ labelPrecio��5      $��Precio��6%   $��
8,72,144,0q�66   $	��Top=�6J   �� 5
   
   -   5         ��Name$ NombreProducto��5
      $��23��5   u   $��178,47,18,0q�6�    �� TextWrapping$
 Wrap=�6�   $	��Top=�6�   ��6   �� *material.NombreProducto+ �� NotifyOnValidationError .  �� ValidatesOnDataErrors . 6�   �� 5   
   -   5        $ textBoxPrecio��5      $��23��5   m   $��178,75,18,0q�6y   $
 Wrap=�6�   $	��Top=�6�   ��6   �� *material.Precio+ .  . 6�   �� 5   
   -   5         ��Name$ comboBoxTipo��5      $��178,103,18,0q�5   t   $	��Top=�6�   ��5   M   �� *tiposDeMaterial+ �� SelectedItem 5      �� *material.Tipo+ .  . 6�   �� 5   
   -   5        $ 	labelTipo��5      $
��Tipo��6#   $��
8,99,144,0q�62   $	��Top=�6F   �� 5   
   -   5         ��Name$ ButtonAnnadirMaterial��5      $��Añadir material��60   $��68,202,68,0q�6J   $	��Top=�6_   6w   5      5      