   M S B A M L   `   `   `  ����  GestionAvituallamientoD    >GestionAvituallamiento.interfaz.AnnadirMaterialAvituallamiento   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$$  AnnadirMaterialAvituallamiento��5   	   $��335.146��60   $	��300��6A   .��5      � .+�5   
   &   System.Windows.Controls.DataGrid  -   5          Name$ DataGridMaterial��5      $��
10,10,10,0q�6-   $	��Top=�6A   $	��200��6Y      AutoGenerateColumns .     
IsReadOnly . ��5      �� *listaMateriales+   Columns 5      0  *System.Windows.Controls.DataGridTextColumn  5	      ,  &System.Windows.Controls.DataGridColumn   Header$ Nombre��6%   1  +System.Windows.Controls.DataGridBoundColumn   Binding 65   �� *NombreProducto+  5
      $
 Tipo��6%    63   �� *Tipo+  5      $ Precio��6%    65   �� *Precio+5      �� 5   
   -   5         ��Name$ LabelCantidad��5      $��Cantidad��6'   $
��Left=�6:   $��
10,215,0,0q�6U   $	��Top=�6i   $��89��6�   �� 5   
   -   5         ��Name$ TextBoxCantidad��5      $
��Left=�5   f   $��23��6�   $��104,219,0,0q�6�   	 �� TextWrapping$
	 Wrap=�6�   $	��Top=�6�   $	��120��6�   ��6   �� *
Cantidad+
 �� NotifyOnValidationError
 .  �� ValidatesOnDataErrors . 6�   �� 5   
   -   5         ��Name$ ButtonAnnadirMaterial��5      $��Añadir material��60   $��10,259,10,0q�6J   $	��Top=�6_   6w   5      5      