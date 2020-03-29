package best.hyun.pgrc.type.kkomi

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kkobi : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kkobi)
    override val type: PET_TYPE
        get() = PET_TYPE.KKOMI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kkobi)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 50
    override val subElementalValue: Int
        get() = 50
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 41
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 7
    override val maxLvMaxHp: Int
        get() = 1338
    override val maxLvMaxAtk: Int
        get() = 325
    override val maxLvMaxDef: Int
        get() = 197
    override val maxLvMaxSpd: Int
        get() = 242
    override val initLvMinHp: Int
        get() = 31
    override val initLvMinAtk: Int
        get() = 8
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1130
    override val maxLvMinAtk: Int
        get() = 287
    override val maxLvMinDef: Int
        get() = 159
    override val maxLvMinSpd: Int
        get() = 211
    override val minAllGrowth: Double
        get() = 4.641
    override val maxAllGrowth: Double
        get() = 5.348
}