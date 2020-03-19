package best.hyun.pgrc.type

import best.hyun.pgrc.type.yangiro.*

interface PetAbstractFactory { fun createPet():Pet }
class BanboroFactory: PetAbstractFactory { override fun createPet(): Pet = Banboro() }
class BanginoFactory: PetAbstractFactory { override fun createPet(): Pet = Bangino() }
class BurudonFactory: PetAbstractFactory { override fun createPet(): Pet = Burudon() }
class GibinoFactory: PetAbstractFactory { override fun createPet(): Pet = Gibino() }
class LibinoFactory: PetAbstractFactory { override fun createPet(): Pet = Libino() }
class YangiroFactory: PetAbstractFactory { override fun createPet(): Pet = Yangiro() }

class PetFactory {
    companion object {
        fun getPet(petAbstractFactory: PetAbstractFactory) = petAbstractFactory.createPet()
        fun getAllPets() {
            val petTypeYangiro = arrayOf(Banboro(), Bangino(), Burudon(), Gibino(), Libino(), Yangiro())

            val allPets:ArrayList<Pet> = ArrayList()
            allPets.addAll(petTypeYangiro)
        }

        fun getAllTypes() = PET_TYPE.values()
        private fun getYangiroPets(): Array<Pet> = arrayOf(Banboro(), Bangino(), Burudon(), Gibino(), Libino(), Yangiro())
        private fun getYangiroPetNames(): Array<CharSequence> {
            val yangiroPets = getYangiroPets()
            val yangiroPetNames: ArrayList<CharSequence> = ArrayList()

            for(pet in yangiroPets)
                yangiroPetNames.add(pet.name)

            return yangiroPetNames.toTypedArray()
        }

        fun getSpecificTypePets(type:PET_TYPE): Array<Pet> = when(type) {
            PET_TYPE.YANGIRO -> getYangiroPets()
            PET_TYPE.OGAROS -> getYangiroPets()
        }

        fun getSpecifcTypeNames(type:PET_TYPE): Array<CharSequence> = when(type) {
            PET_TYPE.YANGIRO -> getYangiroPetNames()
            PET_TYPE.OGAROS -> getYangiroPetNames()
        }
    }
}


