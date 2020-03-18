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

        private var petArray:ArrayList<Pet> = ArrayList()

        fun getPet(petAbstractFactory: PetAbstractFactory) = petAbstractFactory.createPet()
        fun getAllPets() {
            val petTypeYangiro = arrayOf(Banboro(), Bangino(), Burudon(), Gibino(), Libino(), Yangiro())

            val allPets:ArrayList<Pet> = ArrayList()
            allPets.addAll(petTypeYangiro)
        }
    }
}


