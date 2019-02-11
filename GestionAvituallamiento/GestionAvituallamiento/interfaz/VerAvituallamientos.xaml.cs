using GestionAvituallamiento.logica;
using GestionAvituallamiento.modelo;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace GestionAvituallamiento
{
    /// <summary>
    /// Lógica de interacción para Prueba.xaml
    /// </summary>
    public partial class VerAvituallamientos : Window
    {

        public GestionApp gestionApp { get; set; }

        public VerAvituallamientos(GestionApp gestionApp)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;

            this.DataContext = gestionApp;

        }

        private void Row_DoubleClick(object sender, MouseButtonEventArgs e)
        {            
            if (DataGridPrueba.SelectedItem == null) return;
            
            MaterialesAvituallamiento ma = new MaterialesAvituallamiento(DataGridPrueba.SelectedItem as Avituallamiento);
            ma.ShowDialog();
        }

        private void ButtonEditar_Click(object sender, RoutedEventArgs e)
        {
            if (DataGridPrueba.SelectedIndex != -1)
            {
                CrearAvituallamientos crearAvituallamientos = new CrearAvituallamientos
                    (gestionApp, DataGridPrueba.SelectedIndex);
                crearAvituallamientos.ShowDialog();
            }
            else {
                MessageBox.Show("Selecciona un avituallamiento");
            }
        }

        private void ButtonBorrar_Click(object sender, RoutedEventArgs e)
        {
            gestionApp.borrarAvituallamiento(DataGridPrueba.SelectedItem as Avituallamiento);
        }



    }
}
