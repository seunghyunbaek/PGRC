package best.hyun.pgrc.type.manmo

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Manmoru : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_manmoru)
    override val type: PET_TYPE
        get() = PET_TYPE.MANMO
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_manmoru)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 67
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 1949
    override val maxLvMaxAtk: Int
        get() = 279
    override val maxLvMaxDef: Int
        get() = 183
    override val maxLvMaxSpd: Int
        get() = 104
    override val initLvMinHp: Int
        get() = 56
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1731
    override val maxLvMinAtk: Int
        get() = 239
    override val maxLvMinDef: Int
        get() = 143
    override val maxLvMinSpd: Int
        get() = 71
    override val minAllGrowth: Double
        get() = 3.209
    override val maxAllGrowth: Double
        get() = 3.944
}