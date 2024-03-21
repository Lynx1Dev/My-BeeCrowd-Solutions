#include <iostream>
#include <vector>
#include <utility> // Para std::pair
using namespace std;

int main() {
    
    int count;
    cin >> count;
    
    vector<pair<float, int>> grades; // Usando vector para armazenar pares de nota e regNum
    
    while(count--) {
        
        int regNum;
        cin >> regNum;
        
        float grade;
        cin >> grade;

        grades.push_back(make_pair(grade, regNum)); // Adicionando a nota e o regNum ao vetor
        
    }
    
    // Inicializando a busca pela maior nota
    float highestGrade = 8.0; // Considera-se a nota mínima como 8
    int regNumWithHighestGrade = -1; // -1 indica que nenhum regNum foi encontrado inicialmente
    
    for (const auto& gradePair : grades) {
        if (gradePair.first > highestGrade || (gradePair.first == highestGrade && regNumWithHighestGrade == -1)) {
            highestGrade = gradePair.first;
            regNumWithHighestGrade = gradePair.second;
        }
    }
    
    if (regNumWithHighestGrade == -1) {
        cout << "Minimum note not reached" << endl;
    } else {
        cout << regNumWithHighestGrade << endl;
    }
 
    return 0;
}